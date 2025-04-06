package com.xworkz.mobilecase;
import com.xworkz.mobilecase.mobile.MobileCase;
public class MobileCaseRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        MobileCase case1 = new MobileCase();
        case1.setCaseMaterial("Silicone");
        case1.setCaseColor("Black");
        case1.setWaterResistant(true);
        case1.setShockproof(true);
        case1.setCompatibleModelNumber(12345);
        case1.setDimensions("\"6.2 x 3 x 0.5 inches\"");
        case1.setStockQuantity(325);
        String case1Material = case1.getCaseMaterial();
        System.out.println("Case Material: " + case1Material);
        String case1Color = case1.getCaseColor();
        System.out.println("Case Color: " + case1Color);
        boolean case1WaterResistant = case1.getWaterResistant();
        System.out.println("Is Water Resistant: " + case1WaterResistant);
        boolean case1Shockproof = case1.getShockproof();
        case1.setDimensions("\"6.2 x 3 x 0.5 inches\"");
        case1.setStockQuantity(325);   System.out.println("Is Shockproof: " + case1Shockproof);
        int case1ModelNumber = case1.getCompatibleModelNumber();
        System.out.println("Compatible Model Number: " + case1ModelNumber);
        String case1Dimensions = case1.getDimensions();
        System.out.println("Dimension: "+case1Dimensions);
        int case1StockQuantity = case1.getStockQuantity();
        System.out.println("StockQuantity: "+case1StockQuantity);
        System.out.println("*******Complete*********");

        MobileCase case2 = new MobileCase();
        case2.setCaseMaterial("Leather");
        case2.setCaseColor("Brown");
        case2.setWaterResistant(false);
        case2.setShockproof(true);
        case2.setCompatibleModelNumber(54321);
        case2.setDimensions("6.3 x 3.1 x 0.6 inches");
        case2.setStockQuantity(122);
        String case2Material = case2.getCaseMaterial();
        System.out.println("Case Material: " + case2Material);
        String case2Color = case2.getCaseColor();
        System.out.println("Case Color: " + case2Color);
        boolean case2WaterResistant = case2.getWaterResistant();
        System.out.println("Is Water Resistant: " + case2WaterResistant);
        boolean case2Shockproof = case2.getShockproof();
        System.out.println("Is Shockproof: " + case2Shockproof);
        int case2ModelNumber = case2.getCompatibleModelNumber();
        System.out.println("Compatible Model Number: " + case2ModelNumber);
        String case2Dimensions = case2.getDimensions();
        System.out.println("Dimension: "+case2Dimensions);
        int case2StockQuantity = case2.getStockQuantity();
        System.out.println("StockQuantity: "+case2StockQuantity);
        System.out.println("*******Complete*********");

        MobileCase case3 = new MobileCase();
        case3.setCaseMaterial("Plastic");
        case3.setCaseColor("Transparent");
        case3.setWaterResistant(true);
        case3.setShockproof(false);
        case3.setCompatibleModelNumber(67890);
        case3.setDimensions("\"6.2 x 3 x 0.4 inches\"");
        case3.setStockQuantity(892);
        String case3Material = case3.getCaseMaterial();
        System.out.println("Case Material: " + case3Material);
        String case3Color = case3.getCaseColor();
        System.out.println("Case Color: " + case3Color);
        boolean case3WaterResistant = case3.getWaterResistant();
        System.out.println("Is Water Resistant: " + case3WaterResistant);
        boolean case3Shockproof = case3.getShockproof();
        System.out.println("Is Shockproof: " + case3Shockproof);
        int case3ModelNumber = case3.getCompatibleModelNumber();
        System.out.println("Compatible Model Number: " + case3ModelNumber);
        String case3Dimensions = case3.getDimensions();
        System.out.println("Dimension: "+case3Dimensions);
        int case3StockQuantity = case3.getStockQuantity();
        System.out.println("StockQuantity: "+case3StockQuantity);
        System.out.println("*******Complete*********");

        MobileCase case4 = new MobileCase();
        case4.setCaseMaterial("Plastic");
        case4.setCaseColor("Transparent");
        case4.setWaterResistant(true);
        case4.setShockproof(false);
        case4.setCompatibleModelNumber(67890);
        case4.setDimensions("\"6.2 x 3 x 0.5 inches\"");
        case4.setStockQuantity(39);
        String case4Material = case4.getCaseMaterial();
        System.out.println("Case Material: " + case4Material);
        String case4Color = case4.getCaseColor();
        System.out.println("Case Color: " + case4Color);
        boolean case4WaterResistant = case4.getWaterResistant();
        System.out.println("Is Water Resistant: " + case4WaterResistant);
        boolean case4Shockproof = case4.getShockproof();
        System.out.println("Is Shockproof: " + case4Shockproof);
        int case4ModelNumber = case4.getCompatibleModelNumber();
        System.out.println("Compatible Model Number: " + case4ModelNumber);
        String case4Dimensions = case4.getDimensions();
        System.out.println("Dimension: "+case4Dimensions);
        int case4StockQuantity = case4.getStockQuantity();
        System.out.println("StockQuantity: "+case4StockQuantity);
        System.out.println("*******Complete*********");

        MobileCase case5 = new MobileCase();
        case5.setCaseMaterial("Plastic");
        case5.setCaseColor("Transparent");
        case5.setWaterResistant(true);
        case5.setShockproof(false);
        case5.setCompatibleModelNumber(67890);
        case5.setDimensions("\"6.2 x 3 x 0.5 inches\"");
        case5.setStockQuantity(325);
        String case5Material = case5.getCaseMaterial();
        System.out.println("Case Material: " + case5Material);
        String case5Color = case5.getCaseColor();
        System.out.println("Case Color: " + case5Color);
        boolean case5WaterResistant = case5.getWaterResistant();
        System.out.println("Is Water Resistant: " + case5WaterResistant);
        boolean case5Shockproof = case5.getShockproof();
        System.out.println("Is Shockproof: " + case5Shockproof);
        int case5ModelNumber = case5.getCompatibleModelNumber();
        System.out.println("Compatible Model Number: " + case5ModelNumber);
        System.out.println("*******Complete*********");


        System.out.println("Main Ended");

    }
}


