package com.xworkz.mobilecase.mobile;

public class MobileCase {
    private String caseMaterial;
    private String caseColor;
    private boolean isWaterResistant;
    private boolean isShockproof;
    private int compatibleModelNumber;
    private String dimensions;
    private int stockQuantity;

    public void setCaseMaterial(String caseMaterial) {
        this.caseMaterial = caseMaterial;
    }

    public String getCaseMaterial() {
        return caseMaterial;
    }

    public void setCaseColor(String caseColor) {
        this.caseColor = caseColor;
    }

    public String getCaseColor() {
        return caseColor;
    }

    public void setWaterResistant(boolean isWaterResistant) {
        this.isWaterResistant = isWaterResistant;
    }

    public boolean getWaterResistant() {
        return isWaterResistant;
    }

    public void setShockproof(boolean isShockproof) {
        this.isShockproof = isShockproof;
    }

    public boolean getShockproof() {
        return isShockproof;
    }

    public void setCompatibleModelNumber(int compatibleModelNumber) {
        this.compatibleModelNumber = compatibleModelNumber;
    }

    public int getCompatibleModelNumber() {
        return compatibleModelNumber;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
    public String getDimensions() {
        return dimensions;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }
}
