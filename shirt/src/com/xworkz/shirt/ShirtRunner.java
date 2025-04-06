package com.xworkz.shirt;
import com.xworkz.shirt.shirts.Shirt;

public class ShirtRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Shirt shirt1 = new Shirt();
        shirt1.setShirtId(101);
        shirt1.setShirtBrand("Polo Ralph Lauren");
        shirt1.setShirtSize("M");
        shirt1.setShirtColor("Blue");
        shirt1.setShirtPrice(2500.50);
        shirt1.setShirtMaterial("Cotton");
        shirt1.setShirtOrigin("USA");
        System.out.println("Shirt ID: " + shirt1.getShirtId());
        System.out.println("Shirt Brand: " + shirt1.getShirtBrand());
        System.out.println("Shirt Size: " + shirt1.getShirtSize());
        System.out.println("Shirt Color: " + shirt1.getShirtColor());
        System.out.println("Shirt Price: " + shirt1.getShirtPrice());
        System.out.println("Shirt Material: " + shirt1.getShirtMaterial());
        System.out.println("Shirt Origin: " + shirt1.getShirtOrigin());
        System.out.println("*******Complete*********");

        Shirt shirt2 = new Shirt();
        shirt2.setShirtId(202);
        shirt2.setShirtBrand("Tommy Hilfiger");
        shirt2.setShirtSize("L");
        shirt2.setShirtColor("White");
        shirt2.setShirtPrice(3000.75);
        shirt2.setShirtMaterial("Linen");
        shirt2.setShirtOrigin("India");
        System.out.println("Shirt ID: " + shirt2.getShirtId());
        System.out.println("Shirt Brand: " + shirt2.getShirtBrand());
        System.out.println("Shirt Size: " + shirt2.getShirtSize());
        System.out.println("Shirt Color: " + shirt2.getShirtColor());
        System.out.println("Shirt Price: " + shirt2.getShirtPrice());
        System.out.println("Shirt Material: " + shirt2.getShirtMaterial());
        System.out.println("Shirt Origin: " + shirt2.getShirtOrigin());
        System.out.println("*******Complete*********");

        Shirt shirt3 = new Shirt();
        shirt3.setShirtId(303);
        shirt3.setShirtBrand("Calvin Klein");
        shirt3.setShirtSize("XL");
        shirt3.setShirtColor("Black");
        shirt3.setShirtPrice(4000.30);
        shirt3.setShirtMaterial("Silk");
        shirt3.setShirtOrigin("Italy");
        System.out.println("Shirt ID: " + shirt3.getShirtId());
        System.out.println("Shirt Brand: " + shirt3.getShirtBrand());
        System.out.println("Shirt Size: " + shirt3.getShirtSize());
        System.out.println("Shirt Color: " + shirt3.getShirtColor());
        System.out.println("Shirt Price: " + shirt3.getShirtPrice());
        System.out.println("Shirt Material: " + shirt3.getShirtMaterial());
        System.out.println("Shirt Origin: " + shirt3.getShirtOrigin());
        System.out.println("*******Complete*********");

        Shirt shirt4 = new Shirt();
        shirt4.setShirtId(404);
        shirt4.setShirtBrand("Armani");
        shirt4.setShirtSize("S");
        shirt4.setShirtColor("Gray");
        shirt4.setShirtPrice(5000.90);
        shirt4.setShirtMaterial("Polyester");
        shirt4.setShirtOrigin("France");
        System.out.println("Shirt ID: " + shirt4.getShirtId());
        System.out.println("Shirt Brand: " + shirt4.getShirtBrand());
        System.out.println("Shirt Size: " + shirt4.getShirtSize());
        System.out.println("Shirt Color: " + shirt4.getShirtColor());
        System.out.println("Shirt Price: " + shirt4.getShirtPrice());
        System.out.println("Shirt Material: " + shirt4.getShirtMaterial());
        System.out.println("Shirt Origin: " + shirt4.getShirtOrigin());
        System.out.println("*******Complete*********");

        Shirt shirt5 = new Shirt();
        shirt5.setShirtId(505);
        shirt5.setShirtBrand("Zara");
        shirt5.setShirtSize("XXL");
        shirt5.setShirtColor("Red");
        shirt5.setShirtPrice(3500.25);
        shirt5.setShirtMaterial("Denim");
        shirt5.setShirtOrigin("Spain");
        System.out.println("Shirt ID: " + shirt5.getShirtId());
        System.out.println("Shirt Brand: " + shirt5.getShirtBrand());
        System.out.println("Shirt Size: " + shirt5.getShirtSize());
        System.out.println("Shirt Color: " + shirt5.getShirtColor());
        System.out.println("Shirt Price: " + shirt5.getShirtPrice());
        System.out.println("Shirt Material: " + shirt5.getShirtMaterial());
        System.out.println("Shirt Origin: " + shirt5.getShirtOrigin());
        System.out.println("*******Complete*********");


        System.out.println("Main Ended");
    }
}