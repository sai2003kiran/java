package com.xworkz.defencesystem.defence;

public class Defence {
    private String defenceType;
    private String country;
    private int personnelCount;
    private boolean isActive;
    private String equipmentType;
    private int budget;
    private int yearEstablished;

    public void setYearEstablished(int yearEstablished) {
        this.yearEstablished = yearEstablished;
    }

    public int getYearEstablished() {
        return yearEstablished;
    }

    public void setDefenceType(String defenceType) {
        this.defenceType = defenceType;
    }

    public String getDefenceType() {
        return defenceType;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setPersonnelCount(int personnelCount) {
        this.personnelCount = personnelCount;
    }

    public int getPersonnelCount() {
        return personnelCount;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean getActive() {
        return isActive;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }
}