package com.xworkz.insurance.dto;

import com.xworkz.insurance.constants.PolicyType;

public class InsurancePolicyDto {

    private String policyHolderName;
    private String email;
    private String address;
    private String contactNumber;
    private String policyName;
    private double coverageAmount;
    private double premium;
    private PolicyType policyType;

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setCoverageAmount(double coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    public double getCoverageAmount() {
        return coverageAmount;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    public double getPremium() {
        return premium;
    }

    public void setPolicyType(PolicyType policyType) {
        this.policyType = policyType;
    }

    public PolicyType getPolicyType() {
        return policyType;
    }
}
