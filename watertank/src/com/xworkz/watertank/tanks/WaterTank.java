package com.xworkz.watertank.tanks;

public class WaterTank {
    private int tankWarrantyYears;
    private boolean isUVResistance;
    private boolean isAntiAlgae;
    private String tankUsageType;
    private boolean isInsulated;
    private String tankShape;
    private double tankWeight;

    public void setTankWarrantyYears(int tankWarrantyYears) {
        this.tankWarrantyYears = tankWarrantyYears;
    }

    public int getTankWarrantyYears() {
        return tankWarrantyYears;
    }

    public void setUVResistance(boolean isUVResistance) {
        this.isUVResistance = isUVResistance;
    }

    public boolean getUVResistance() {
        return isUVResistance;
    }

    public void setAntiAlgae(boolean isAntiAlgae) {
        this.isAntiAlgae = isAntiAlgae;
    }

    public boolean getAntiAlgae() {
        return isAntiAlgae;
    }

    public void setTankUsageType(String tankUsageType) {
        this.tankUsageType = tankUsageType;
    }

    public String getTankUsageType() {
        return tankUsageType;
    }

    public void setInsulated(boolean isInsulated) {
        this.isInsulated = isInsulated;
    }

    public boolean getInsulated() {
        return isInsulated;
    }

    public void setTankShape(String tankShape) {
        this.tankShape = tankShape;
    }

    public String getTankShape() {
        return tankShape;
    }

    public void setTankWeight(double tankWeight) {
        this.tankWeight = tankWeight;
    }

    public double getTankWeight() {
        return tankWeight;
    }
}