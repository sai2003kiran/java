package com.xworkz.steel;
import com.xworkz.steel.steels.Steel;

public class SteelRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Steel steel1 = new Steel();
        steel1.setSteelId(101);
        steel1.setSteelBrand("TATA STEEL");
        steel1.setSteelType("Mild Steel");
        steel1.setSteelWeight(500);
        steel1.setSteelPrice(1200.50);
        steel1.setSteelGrade("Fe500");
        steel1.setSteelOrigin("India");
        System.out.println("Steel ID: " + steel1.getSteelId());
        System.out.println("Steel Brand: " + steel1.getSteelBrand());
        System.out.println("Steel Type: " + steel1.getSteelType());
        System.out.println("Steel Weight: " + steel1.getSteelWeight());
        System.out.println("Steel Price: " + steel1.getSteelPrice());
        System.out.println("Steel Grade: " + steel1.getSteelGrade());
        System.out.println("Steel Origin: " + steel1.getSteelOrigin());
        System.out.println("*******Complete*********");

        Steel steel2 = new Steel();
        steel2.setSteelId(202);
        steel2.setSteelBrand("JSW STEEL");
        steel2.setSteelType("Stainless Steel");
        steel2.setSteelWeight(750);
        steel2.setSteelPrice(1800.75);
        steel2.setSteelGrade("304");
        steel2.setSteelOrigin("India");
        System.out.println("Steel ID: " + steel2.getSteelId());
        System.out.println("Steel Brand: " + steel2.getSteelBrand());
        System.out.println("Steel Type: " + steel2.getSteelType());
        System.out.println("Steel Weight: " + steel2.getSteelWeight());
        System.out.println("Steel Price: " + steel2.getSteelPrice());
        System.out.println("Steel Grade: " + steel2.getSteelGrade());
        System.out.println("Steel Origin: " + steel2.getSteelOrigin());
        System.out.println("*******Complete*********");

        Steel steel3 = new Steel();
        steel3.setSteelId(303);
        steel3.setSteelBrand("SAIL");
        steel3.setSteelType("Galvanized Steel");
        steel3.setSteelWeight(600);
        steel3.setSteelPrice(1600.30);
        steel3.setSteelGrade("Fe550");
        steel3.setSteelOrigin("India");
        System.out.println("Steel ID: " + steel3.getSteelId());
        System.out.println("Steel Brand: " + steel3.getSteelBrand());
        System.out.println("Steel Type: " + steel3.getSteelType());
        System.out.println("Steel Weight: " + steel3.getSteelWeight());
        System.out.println("Steel Price: " + steel3.getSteelPrice());
        System.out.println("Steel Grade: " + steel3.getSteelGrade());
        System.out.println("Steel Origin: " + steel3.getSteelOrigin());
        System.out.println("*******Complete*********");

        Steel steel4 = new Steel();
        steel4.setSteelId(404);
        steel4.setSteelBrand("ESSAR STEEL");
        steel4.setSteelType("Carbon Steel");
        steel4.setSteelWeight(700);
        steel4.setSteelPrice(1900.65);
        steel4.setSteelGrade("Fe600");
        steel4.setSteelOrigin("India");
        System.out.println("Steel ID: " + steel4.getSteelId());
        System.out.println("Steel Brand: " + steel4.getSteelBrand());
        System.out.println("Steel Type: " + steel4.getSteelType());
        System.out.println("Steel Weight: " + steel4.getSteelWeight());
        System.out.println("Steel Price: " + steel4.getSteelPrice());
        System.out.println("Steel Grade: " + steel4.getSteelGrade());
        System.out.println("Steel Origin: " + steel4.getSteelOrigin());
        System.out.println("*******Complete*********");

        Steel steel5 = new Steel();
        steel5.setSteelId(505);
        steel5.setSteelBrand("VIZAG STEEL");
        steel5.setSteelType("Alloy Steel");
        steel5.setSteelWeight(650);
        steel5.setSteelPrice(1750.45);
        steel5.setSteelGrade("Fe450");
        steel5.setSteelOrigin("India");
        System.out.println("Steel ID: " + steel5.getSteelId());
        System.out.println("Steel Brand: " + steel5.getSteelBrand());
        System.out.println("Steel Type: " + steel5.getSteelType());
        System.out.println("Steel Weight: " + steel5.getSteelWeight());
        System.out.println("Steel Price: " + steel5.getSteelPrice());
        System.out.println("Steel Grade: " + steel5.getSteelGrade());
        System.out.println("Steel Origin: " + steel5.getSteelOrigin());
        System.out.println("*******Complete*********");

        System.out.println("Main Ended");
    }
}