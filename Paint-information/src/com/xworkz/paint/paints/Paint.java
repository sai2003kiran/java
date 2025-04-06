package com.xworkz.paint.paints;

public class Paint {
    private int paintId;
    private String paintBrand;
    private String paintColour;
    private int paintQuantity;
    private double paintPrice;

    public void setPaintId(int paintId){
        this.paintId=paintId;
    }
    public int getPaintId(){
        return paintId;
    }

    public void setPaintBrand(String paintBrand) {
        this.paintBrand = paintBrand;
    }
    public String getPaintBrand() {
        return paintBrand;
    }

    public void setPaintColour(String paintColour) {
        this.paintColour = paintColour;
    }

    public String getPaintColour() {
        return paintColour;
    }
    public void setPaintQuantity(int paintQuantity) {
        this.paintQuantity = paintQuantity;
    }
    public int getPaintQuantity() {
        return paintQuantity;
    }

    public void setPaintPrice(double paintPrice) {
        this.paintPrice = paintPrice;
    }
    public double getPaintPrice() {
        return paintPrice;
    }
}
