package com.xworkz.mattress.mattres;

public class Mattress {

    private int mattressThickness;
    private String mattressMaterial;
    private boolean isFoldable;
    private int maxWeightCapacity;
    private String mattressUsageType;
    private String mattressColor;
    private double price;
    public void setMattressThickness(int mattressThickness) {
        this.mattressThickness = mattressThickness;
    }

    public int getMattressThickness() {
        return mattressThickness;
    }

    public void setMattressMaterial(String mattressMaterial) {
        this.mattressMaterial = mattressMaterial;
    }

    public String getMattressMaterial() {
        return mattressMaterial;
    }

    public void setFoldable(boolean isFoldable) {
        this.isFoldable = isFoldable;
    }

    public boolean getFoldable() {
        return isFoldable;
    }

    public void setMaxWeightCapacity(int maxWeightCapacity) {
        this.maxWeightCapacity = maxWeightCapacity;
    }

    public int getMaxWeightCapacity() {
        return maxWeightCapacity;
    }

    public void setMattressUsageType(String mattressUsageType) {
        this.mattressUsageType = mattressUsageType;
    }

    public String getMattressUsageType() {
        return mattressUsageType;
    }

    public void setMattressColor(String mattressColor) {
        this.mattressColor = mattressColor;
    }

    public String getMattressColor() {
        return mattressColor;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

