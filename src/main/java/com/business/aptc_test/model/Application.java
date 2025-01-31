package com.business.aptc_test.model;

public class Application {
    private String appID; 
    private Double incomeFPL;
    private Double rangeMin;
    private Double rangeMax;
    private Double iniPer;
    private Double finPer;
    private Double incomeAmount;
    private Double insurancePremiumAmount;

    private Double rangePerc;
    private Double percDiff;
    private Double appPerc;
    private Double affordableAmount;
    private Double maxAPTC;
    
    private boolean processError; 
    public String getAppID() {
        return appID;
    }

    public void setAppID(String appID) {
        this.appID = appID;
    }

    public Double getIncomeFPL() {
        return incomeFPL;
    }

    public void setIncomeFPL(Double incomeFPL) {
        this.incomeFPL = incomeFPL;
    }

    public Double getRangeMin() {
        return rangeMin;
    }

    public void setRangeMin(Double rangeMin) {
        this.rangeMin = rangeMin;
    }

    public Double getRangeMax() {
        return rangeMax;
    }

    public void setRangeMax(Double rangeMax) {
        this.rangeMax = rangeMax;
    }

    public Double getIniPer() {
        return iniPer;
    }

    public void setIniPer(Double iniPer) {
        this.iniPer = iniPer;
    }

    public Double getFinPer() {
        return finPer;
    }

    public void setFinPer(Double finPer) {
        this.finPer = finPer;
    }

    public Double getIncomeAmount() {
        return incomeAmount;
    }

    public void setIncomeAmount(Double incomeAmount) {
        this.incomeAmount = incomeAmount;
    }

    public Double getInsurancePremiumAmount() {
        return insurancePremiumAmount;
    }

    public void setInsurancePremiumAmount(Double insurancePremiumAmount) {
        this.insurancePremiumAmount = insurancePremiumAmount;
    }

    public Double getRangePerc() {
        return rangePerc;
    }

    public void setRangePerc(Double rangePerc) {
        this.rangePerc = rangePerc;
    }

    public Double getPercDiff() {
        return percDiff;
    }

    public void setPercDiff(Double percDiff) {
        this.percDiff = percDiff;
    }

    public Double getAppPerc() {
        return appPerc;
    }

    public void setAppPerc(Double appPerc) {
        this.appPerc = appPerc;
    }

    public Double getAffordableAmount() {
        return affordableAmount;
    }

    public void setAffordableAmount(Double affordableAmount) {
        this.affordableAmount = affordableAmount;
    }

    public Double getMaxAPTC() {
        return maxAPTC;
    }

    public void setMaxAPTC(Double maxAPTC) {
        this.maxAPTC = maxAPTC;
    }

    public boolean isProcessError() {
        return processError;
    }

    public void setProcessError(boolean processError) {
        this.processError = processError;
    }

}