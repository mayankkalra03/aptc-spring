package com.business.aptc_test.config;

import org.kie.api.event.rule.AfterMatchFiredEvent;
import org.kie.api.event.rule.DefaultAgendaEventListener;

import java.util.ArrayList;
import java.util.List;

public class CustomAgendaEventListener extends DefaultAgendaEventListener {
    private final List<String> firedRules = new ArrayList<>();

    @Override
    public void afterMatchFired(AfterMatchFiredEvent event) {
        firedRules.add(event.getMatch().getRule().getName());
    }

    public List<String> getFiredRules() {
        return firedRules;
    }
}
