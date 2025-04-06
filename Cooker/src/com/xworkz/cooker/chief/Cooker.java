package com.xworkz.cooker.chief;
public class Cooker {
    private int capacityInLiters;
    private String material;
    private boolean isElectric;
    private int maxPressure;
    private String usageType;
    private String color;
    private String brandName; // New variable added

    public void setCapacityInLiters(int capacityInLiters) {
        this.capacityInLiters = capacityInLiters;
    }

    public int getCapacityInLiters() {
        return capacityInLiters;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public boolean getElectric() {
        return isElectric;
    }

    public void setMaxPressure(int maxPressure) {
        this.maxPressure = maxPressure;
    }

    public int getMaxPressure() {
        return maxPressure;
    }

    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }

    public String getUsageType() {
        return usageType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setBrandName(String brandName) { // New setter
        this.brandName = brandName;
    }

    public String getBrandName() { // New getter
        return brandName;
    }

}
