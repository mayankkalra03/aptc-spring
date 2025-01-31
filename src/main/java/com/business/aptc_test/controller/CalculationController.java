package com.business.aptc_test.controller;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.business.aptc_test.config.CustomAgendaEventListener;
import com.business.aptc_test.model.Application;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CalculationController {

    @Autowired
    private KieContainer kieContainer;

    @PostMapping("/calculate")
    public ResponseEntity<?> calculate(@RequestBody Application app) {
        KieSession session = kieContainer.newKieSession();

        // Attach custom listener to capture all fired rules
        CustomAgendaEventListener listener = new CustomAgendaEventListener();
        session.addEventListener(listener);

        session.insert(app);
        session.fireAllRules();

        // Get all rules that were fired
        List<String> firedRules = listener.getFiredRules();

        // If there's an error, return only the error message with all fired rules
        if (app.isProcessError()) {
            Map<String, Object> errorResponse = new HashMap<>();
            errorResponse.put("error", "Validation Failed");
            errorResponse.put("firedRules", firedRules);

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }

        // Otherwise, return application object with all fired rules
        Map<String, Object> successResponse = new HashMap<>();
        successResponse.put("application", app);
        successResponse.put("firedRules", firedRules);

        return ResponseEntity.ok(successResponse);
    }
}
