package com.xworkz.simcard.sim;

public class SimCard {
    private String simType;
    private String networkProvider;
    private long phoneNumber;
    private boolean isPrepaid;
    private int dataBalance; // in GB
    private String activationDate;
    private String planName; // New variable for the plan name

    public void setSimType(String simType) {
        this.simType = simType;
    }

    public String getSimType() {
        return simType;
    }

    public void setNetworkProvider(String networkProvider) {
        this.networkProvider = networkProvider;
    }

    public String getNetworkProvider() {
        return networkProvider;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPrepaid(boolean isPrepaid) {
        this.isPrepaid = isPrepaid;
    }

    public boolean getPrepaid() {
        return isPrepaid;
    }

    public void setDataBalance(int dataBalance) {
        this.dataBalance = dataBalance;
    }

    public int getDataBalance() {
        return dataBalance;
    }

    public void setActivationDate(String activationDate) {
        this.activationDate = activationDate;
    }

    public String getActivationDate() {
        return activationDate;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getPlanName() {
        return planName;
    }
}
