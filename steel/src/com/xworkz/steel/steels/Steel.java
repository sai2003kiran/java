package com.xworkz.steel.steels;

public class Steel {
    private int steelId;
    private String steelBrand;
    private String steelType;
    private int steelWeight;
    private double steelPrice;
    private String steelGrade;
    private String steelOrigin;

    public void setSteelId(int steelId){
        this.steelId = steelId;
    }
    public int getSteelId(){
        return steelId;
    }

    public void setSteelBrand(String steelBrand) {
        this.steelBrand = steelBrand;
    }
    public String getSteelBrand() {
        return steelBrand;
    }

    public void setSteelType(String steelType) {
        this.steelType = steelType;
    }
    public String getSteelType() {
        return steelType;
    }

    public void setSteelWeight(int steelWeight) {
        this.steelWeight = steelWeight;
    }
    public int getSteelWeight() {
        return steelWeight;
    }

    public void setSteelPrice(double steelPrice) {
        this.steelPrice = steelPrice;
    }
    public double getSteelPrice() {
        return steelPrice;
    }

    public void setSteelGrade(String steelGrade) {
        this.steelGrade = steelGrade;
    }
    public String getSteelGrade() {
        return steelGrade;
    }

    public void setSteelOrigin(String steelOrigin) {
        this.steelOrigin = steelOrigin;
    }
    public String getSteelOrigin() {
        return steelOrigin;
    }
}