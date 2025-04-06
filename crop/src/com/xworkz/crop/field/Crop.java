
package com.xworkz.crop.field;

public class Crop {
    private String cropName;
    private double areaCultivated;
    private String season;
    private double yieldPerHectare;
    private String soilType;
    private String irrigationType;
    private double marketPrice;     

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public String getCropName() {
        return cropName;
    }

    public void setAreaCultivated(double areaCultivated) {
        this.areaCultivated = areaCultivated;
    }

    public double getAreaCultivated() {
        return areaCultivated;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    public void setYieldPerHectare(double yieldPerHectare) {
        this.yieldPerHectare = yieldPerHectare;
    }

    public double getYieldPerHectare() {
        return yieldPerHectare;
    }

    public void setSoilType(String soilType) {
        this.soilType = soilType;
    }

    public String getSoilType() {
        return soilType;
    }

    public void setIrrigationType(String irrigationType) {
        this.irrigationType = irrigationType;
    }

    public String getIrrigationType() {
        return irrigationType;
    }

    public void setMarketPrice(double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public double getMarketPrice() {
        return marketPrice;
    }
}