package com.xworkz.buttermilk;
import com.xworkz.buttermilk.curd.Buttermilk;
public class ButtermilkRunner {
    public static void main(String[] args) {
        Buttermilk milk1 = new Buttermilk();
        milk1.setBrandName("Amul");
        milk1.setQuantity(1.0);
        milk1.setManufacturingDate("12-1-2025");
        milk1.setExpiryDate("13-1-2025");
        milk1.setLowFat(true);
        milk1.setPrice(40.0);
        milk1.setFlavor("Mint");

        String milk1BrandName = milk1.getBrandName();
        System.out.println("Brand Name: " + milk1BrandName);
        double milk1Quantity = milk1.getQuantity();
        System.out.println("Quantity: " + milk1Quantity + " liters");
        String milk1ManufacturingDate = milk1.getManufacturingDate();
        System.out.println("Manufacturing Date: " + milk1ManufacturingDate);
        String milk1ExpiryDate = milk1.getExpiryDate();
        System.out.println("Expiry Date: " + milk1ExpiryDate);
        boolean milk1LowFat = milk1.getLowFat();
        System.out.println("Low Fat: " + milk1LowFat);
        double milk1Price = milk1.getPrice();
        System.out.println("Price: " + milk1Price + " INR");
        String milk1Flavor = milk1.getFlavor();
        System.out.println("Flavor: " + milk1Flavor);
        System.out.println("*******Complete*********");

        Buttermilk milk2 = new Buttermilk();
        milk2.setBrandName("Nandini");
        milk2.setQuantity(0.5);
        milk2.setManufacturingDate("23-1-2025");
        milk2.setExpiryDate("24-1-2025");
        milk2.setLowFat(false);
        milk2.setPrice(25.0);
        milk2.setFlavor("Plain");

        String milk2BrandName = milk2.getBrandName();
        System.out.println("Brand Name: " + milk2BrandName);
        double milk2Quantity = milk2.getQuantity();
        System.out.println("Quantity: " + milk2Quantity + " liters");
        String milk2ManufacturingDate = milk2.getManufacturingDate();
        System.out.println("Manufacturing Date: " + milk2ManufacturingDate);
        String milk2ExpiryDate = milk2.getExpiryDate();
        System.out.println("Expiry Date: " + milk2ExpiryDate);
        boolean milk2LowFat = milk2.getLowFat();
        System.out.println("Low Fat: " + milk2LowFat);
        double milk2Price = milk2.getPrice();
        System.out.println("Price: " + milk2Price + " INR");
        String milk2Flavor = milk2.getFlavor();
        System.out.println("Flavor: " + milk2Flavor);
        System.out.println("*******Complete*********");

        Buttermilk milk3 = new Buttermilk();
        milk3.setBrandName("Nestle");
        milk3.setQuantity(1.5);
        milk3.setManufacturingDate("29-2-2025");
        milk3.setExpiryDate("30-2-2025");
        milk3.setLowFat(true);
        milk3.setPrice(60.0);
        milk3.setFlavor("Strawberry");

        String milk3BrandName = milk3.getBrandName();
        System.out.println("Brand Name: " + milk3BrandName);
        double milk3Quantity = milk3.getQuantity();
        System.out.println("Quantity: " + milk3Quantity + " liters");
        String milk3ManufacturingDate = milk3.getManufacturingDate();
        System.out.println("Manufacturing Date: " + milk3ManufacturingDate);
        String milk3ExpiryDate = milk3.getExpiryDate();
        System.out.println("Expiry Date: " + milk3ExpiryDate);
        boolean milk3LowFat = milk3.getLowFat();
        System.out.println("Low Fat: " + milk3LowFat);
        double milk3Price = milk3.getPrice();
        System.out.println("Price: " + milk3Price + " INR");
        String milk3Flavor = milk3.getFlavor();
        System.out.println("Flavor: " + milk3Flavor);
        System.out.println("*******Complete*********");

        Buttermilk milk4 = new Buttermilk();
        milk4.setBrandName("Amul");
        milk4.setQuantity(1.0);
        milk4.setManufacturingDate("28-02-2025");
        milk4.setExpiryDate("02-03-2025");
        milk4.setLowFat(false);
        milk4.setPrice(50.0);
        milk4.setFlavor("Plain");



        String milk4BrandName = milk4.getBrandName();
        System.out.println("Brand Name: " + milk4BrandName);
        double milk4Quantity = milk4.getQuantity();
        System.out.println("Quantity: " + milk4Quantity + " liters");
        String milk4ManufacturingDate = milk4.getManufacturingDate();
        System.out.println("Manufacturing Date: " + milk4ManufacturingDate);
        String milk4ExpiryDate = milk4.getExpiryDate();
        System.out.println("Expiry Date: " + milk4ExpiryDate);
        boolean milk4LowFat = milk4.getLowFat();
        System.out.println("Low Fat: " + milk4LowFat);
        double milk4Price = milk4.getPrice();
        System.out.println("Price: " + milk4Price + " INR");
        String milk4Flavor = milk4.getFlavor();
        System.out.println("Flavor: " + milk4Flavor);
        System.out.println("*******Complete*********");

        Buttermilk milk5 = new Buttermilk();
        milk5.setBrandName("Mother Dairy");
        milk5.setQuantity(1.2);
        milk5.setManufacturingDate("27-02-2025");
        milk5.setExpiryDate("01-03-2025");
        milk5.setLowFat(true);
        milk5.setPrice(55.0);
        milk5.setFlavor("Mint");
        String milk5BrandName = milk5.getBrandName();
        System.out.println("Brand Name: " + milk2BrandName);
        double milk5Quantity = milk5.getQuantity();
        System.out.println("Quantity: " + milk5Quantity + " liters");
        String milk5ManufacturingDate = milk5.getManufacturingDate();
        System.out.println("Manufacturing Date: " + milk5ManufacturingDate);
        String milk5ExpiryDate = milk5.getExpiryDate();
        System.out.println("Expiry Date: " + milk5ExpiryDate);
        boolean milk5LowFat = milk5.getLowFat();
        System.out.println("Low Fat: " + milk5LowFat);
        double milk5Price = milk5.getPrice();
        System.out.println("Price: " + milk5Price + " INR");
        String milk5Flavor = milk5.getFlavor();
        System.out.println("Flavor: " + milk5Flavor);
        System.out.println("*******Complete*********");

    }
}
