package com.xworkz.cooker;
import com.xworkz.cooker.chief.Cooker;
public class CookerRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Cooker cooker1 = new Cooker();
        cooker1.setCapacityInLiters(5);
        cooker1.setMaterial("Stainless Steel");
        cooker1.setElectric(false);
        cooker1.setMaxPressure(15);
        cooker1.setUsageType("Domestic");
        cooker1.setColor("Silver");
        cooker1.setBrandName("Prestige");

        int capacity1 = cooker1.getCapacityInLiters();
        String material1 = cooker1.getMaterial();
        boolean isElectric1 = cooker1.getElectric();
        int maxPressure1 = cooker1.getMaxPressure();
        String usageType1 = cooker1.getUsageType();
        String color1 = cooker1.getColor();
        String brandName1 = cooker1.getBrandName();

        System.out.println("Cooker 1 Details:");
        System.out.println("Capacity in Liters: " + capacity1);
        System.out.println("Material: " + material1);
        System.out.println("Is Electric: " + isElectric1);
        System.out.println("Max Pressure: " + maxPressure1);
        System.out.println("Usage Type: " + usageType1);
        System.out.println("Color: " + color1);
        System.out.println("Brand Name: " + brandName1);
        System.out.println("*******Complete*********");

        Cooker cooker2 = new Cooker();
        cooker2.setCapacityInLiters(8);
        cooker2.setMaterial("Aluminum");
        cooker2.setElectric(true);
        cooker2.setMaxPressure(20);
        cooker2.setUsageType("Commercial");
        cooker2.setColor("Black");
        cooker2.setBrandName("Prestige");

        int capacity2 = cooker2.getCapacityInLiters();
        String material2 = cooker2.getMaterial();
        boolean isElectric2 = cooker2.getElectric();
        int maxPressure2 = cooker2.getMaxPressure();
        String usageType2 = cooker2.getUsageType();
        String color2 = cooker2.getColor();
        String brandName2 = cooker2.getBrandName();

        System.out.println("Cooker 2 Details:");
        System.out.println("Capacity in Liters: " + capacity2);
        System.out.println("Material: " + material2);
        System.out.println("Is Electric: " + isElectric2);
        System.out.println("Max Pressure: " + maxPressure2);
        System.out.println("Usage Type: " + usageType2);
        System.out.println("Color: " + color2);
        System.out.println("Brand Name: " + brandName2);
        System.out.println("*******Complete*********");

        Cooker cooker3 = new Cooker();
        cooker3.setCapacityInLiters(3);
        cooker3.setMaterial("Ceramic");
        cooker3.setElectric(true);
        cooker3.setMaxPressure(10);
        cooker3.setUsageType("Domestic");
        cooker3.setColor("White");
        cooker3.setBrandName("Philips");

        int capacity3 = cooker3.getCapacityInLiters();
        String material3 = cooker3.getMaterial();
        boolean isElectric3 = cooker3.getElectric();
        int maxPressure3 = cooker3.getMaxPressure();
        String usageType3 = cooker3.getUsageType();
        String color3 = cooker3.getColor();
        String brandName3 = cooker3.getBrandName();

        System.out.println("Cooker 3 Details:");
        System.out.println("Capacity in Liters: " + capacity3);
        System.out.println("Material: " + material3);
        System.out.println("Is Electric: " + isElectric3);
        System.out.println("Max Pressure: " + maxPressure3);
        System.out.println("Usage Type: " + usageType3);
        System.out.println("Color: " + color3);
        System.out.println("Brand Name: " + brandName3);
        System.out.println("*******Complete*********");

        Cooker cooker4 = new Cooker();
        cooker4.setCapacityInLiters(6);
        cooker4.setMaterial("Copper");
        cooker4.setElectric(false);
        cooker4.setMaxPressure(14);
        cooker4.setUsageType("Industrial");
        cooker4.setColor("Bronze");
        cooker4.setBrandName("Bajaj");


        int capacity4 = cooker4.getCapacityInLiters();
        String material4 = cooker4.getMaterial();
        boolean isElectric4 = cooker4.getElectric();
        int maxPressure4 = cooker4.getMaxPressure();
        String usageType4 = cooker4.getUsageType();
        String color4 = cooker4.getColor();
        String brandName4 = cooker4.getBrandName();

        System.out.println("Cooker 4 Details:");
        System.out.println("Capacity in Liters: " + capacity4);
        System.out.println("Material: " + material4);
        System.out.println("Is Electric: " + isElectric4);
        System.out.println("Max Pressure: " + maxPressure4);
        System.out.println("Usage Type: " + usageType4);
        System.out.println("Color: " + color4);
        System.out.println("Brand Name: " + brandName4);
        System.out.println("*******Complete*********");

        Cooker cooker5 = new Cooker();
        cooker5.setCapacityInLiters(6);
        cooker5.setMaterial("Copper");
        cooker5.setElectric(false);
        cooker5.setMaxPressure(14);
        cooker5.setUsageType("Industrial");
        cooker5.setColor("Bronze");
        cooker5.setBrandName("Bajaj");


        int capacity5 = cooker5.getCapacityInLiters();
        String material5 = cooker5.getMaterial();
        boolean isElectric5 = cooker5.getElectric();
        int maxPressure5 = cooker5.getMaxPressure();
        String usageType5 = cooker5.getUsageType();
        String color5 = cooker5.getColor();
        String brandName5 = cooker5.getBrandName();

        System.out.println("Cooker 5 Details:");
        System.out.println("Capacity in Liters: " + capacity5);
        System.out.println("Material: " + material5);
        System.out.println("Is Electric: " + isElectric5);
        System.out.println("Max Pressure: " + maxPressure5);
        System.out.println("Usage Type: " + usageType5);
        System.out.println("Color: " + color5);
        System.out.println("Brand Name: " + brandName5);
        System.out.println("*******Complete*********");

        System.out.println("Main Ended");

    }
}
