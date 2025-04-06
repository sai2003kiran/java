package com.xworkz.shirt.shirts;

public class Shirt {
    private int shirtId;
    private String shirtBrand;
    private String shirtSize;
    private String shirtColor;
    private double shirtPrice;
    private String shirtMaterial;
    private String shirtOrigin;

    public void setShirtId(int shirtId){
        this.shirtId = shirtId;
    }
    public int getShirtId(){
        return shirtId;
    }

    public void setShirtBrand(String shirtBrand) {
        this.shirtBrand = shirtBrand;
    }
    public String getShirtBrand() {
        return shirtBrand;
    }

    public void setShirtSize(String shirtSize) {
        this.shirtSize = shirtSize;
    }
    public String getShirtSize() {
        return shirtSize;
    }

    public void setShirtColor(String shirtColor) {
        this.shirtColor = shirtColor;
    }
    public String getShirtColor() {
        return shirtColor;
    }

    public void setShirtPrice(double shirtPrice) {
        this.shirtPrice = shirtPrice;
    }
    public double getShirtPrice() {
        return shirtPrice;
    }

    public void setShirtMaterial(String shirtMaterial) {
        this.shirtMaterial = shirtMaterial;
    }
    public String getShirtMaterial() {
        return shirtMaterial;
    }

    public void setShirtOrigin(String shirtOrigin) {
        this.shirtOrigin = shirtOrigin;
    }
    public String getShirtOrigin() {
        return shirtOrigin;
    }
}