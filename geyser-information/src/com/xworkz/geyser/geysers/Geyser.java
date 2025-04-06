package com.xworkz.geyser.geysers;

public class Geyser {
    private int geyserCapacity;
    private String geyserBrand;
    private boolean isInstant;
    private int powerConsumption;
    private String geyserUsageType;
    private String geyserColor;
    private int heatingTime;

    public void setHeatingTime(int heatingTime) {
        this.heatingTime = heatingTime;
    }

    public int getHeatingTime() {
        return heatingTime;
    }

    public void setGeyserCapacity(int geyserCapacity) {
        this.geyserCapacity = geyserCapacity;
    }

    public int getGeyserCapacity() {
        return geyserCapacity;
    }

    public void setGeyserBrand(String geyserBrand) {
        this.geyserBrand = geyserBrand;
    }

    public String getGeyserBrand() {
        return geyserBrand;
    }

    public void setInstant(boolean isInstant) {
        this.isInstant = isInstant;
    }

    public boolean getInstant() {
        return isInstant;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setGeyserUsageType(String geyserUsageType) {
        this.geyserUsageType = geyserUsageType;
    }

    public String getGeyserUsageType() {
        return geyserUsageType;
    }

    public void setGeyserColor(String geyserColor) {
        this.geyserColor = geyserColor;
    }

    public String getGeyserColor() {
        return geyserColor;
    }
}