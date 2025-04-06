package com.xworkz.buttermilk.curd;
public class Buttermilk {
    private String brandName;
    private double quantity;
    private String manufacturingDate;
    private String expiryDate;
    private boolean isLowFat;
    private double price;
    private String flavor;

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getManufacturingDate() {
        return manufacturingDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setLowFat(boolean isLowFat) {
        this.isLowFat = isLowFat;
    }

    public boolean getLowFat() {
        return isLowFat;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }
}
