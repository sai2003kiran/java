package com.xworkz.defencesystem;

import com.xworkz.defencesystem.defence.Defence;

public class DefenceRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Defence defence1 = new Defence();
        defence1.setDefenceType("Army");
        defence1.setCountry("USA");
        defence1.setPersonnelCount(1200000);
        defence1.setActive(true);
        defence1.setEquipmentType("Tanks & Artillery");
        defence1.setBudget(750000);
        defence1.setYearEstablished(1920);

        String type1 = defence1.getDefenceType();
        String country1 = defence1.getCountry();
        int personnel1 = defence1.getPersonnelCount();
        boolean active1 = defence1.getActive();
        String equipment1 = defence1.getEquipmentType();
        int budget1 = defence1.getBudget();
        int yearEstablished1 = defence1.getYearEstablished();

        System.out.println("Defence Type: " + type1);
        System.out.println("Country: " + country1);
        System.out.println("Personnel Count: " + personnel1);
        System.out.println("Is Active: " + active1);
        System.out.println("Equipment Type: " + equipment1);
        System.out.println("Budget: $" + budget1);
        System.out.println("Year Started: "+yearEstablished1);
        System.out.println("*******Complete*********");

        Defence defence2 = new Defence();
        defence2.setDefenceType("Navy");
        defence2.setCountry("India");
        defence2.setPersonnelCount(500000);
        defence2.setActive(true);
        defence2.setEquipmentType("Submarines & Ships");
        defence2.setBudget(450000);
        defence2.setYearEstablished(1909);

        String type2 = defence2.getDefenceType();
        String country2 = defence2.getCountry();
        int personnel2 = defence2.getPersonnelCount();
        boolean active2 = defence2.getActive();
        String equipment2 = defence2.getEquipmentType();
        int budget2 = defence2.getBudget();
        int yearEstablished2 = defence1.getYearEstablished();
        System.out.println("Defence Type: " + type2);
        System.out.println("Country: " + country2);
        System.out.println("Personnel Count: " + personnel2);
        System.out.println("Is Active: " + active2);
        System.out.println("Equipment Type: " + equipment2);
        System.out.println("Budget: $" + budget2);
        System.out.println("Year Started: "+yearEstablished2);
        System.out.println("*******Complete*********");

        Defence defence3 = new Defence();
        defence3.setDefenceType("Air Force");
        defence3.setCountry("UK");
        defence3.setPersonnelCount(320000);
        defence3.setActive(true);
        defence3.setEquipmentType("Jets & Helicopters");
        defence3.setBudget(600000);
        defence3.setYearEstablished(1959);

        String type3 = defence3.getDefenceType();
        String country3 = defence3.getCountry();
        int personnel3 = defence3.getPersonnelCount();
        boolean active3 = defence3.getActive();
        String equipment3 = defence3.getEquipmentType();
        int budget3 = defence3.getBudget();
        int yearEstablished3 = defence1.getYearEstablished();
        System.out.println("Defence Type: " + type3);
        System.out.println("Country: " + country3);
        System.out.println("Personnel Count: " + personnel3);
        System.out.println("Is Active: " + active3);
        System.out.println("Equipment Type: " + equipment3);
        System.out.println("Budget: $" + budget3);
        System.out.println("Year Started: "+yearEstablished3);
        System.out.println("*******Complete*********");

        Defence defence4 = new Defence();
        defence4.setDefenceType("Cyber Defence");
        defence4.setCountry("Germany");
        defence4.setPersonnelCount(15000);
        defence4.setActive(true);
        defence4.setEquipmentType("Cyber Security Systems");
        defence4.setBudget(300000);
        defence4.setYearEstablished(1938);
        int yearEstablished4 = defence1.getYearEstablished();
        String type4 = defence4.getDefenceType();
        String country4 = defence4.getCountry();
        int personnel4 = defence4.getPersonnelCount();
        boolean active4 = defence4.getActive();
        String equipment4 = defence4.getEquipmentType();
        int budget4 = defence4.getBudget();

        System.out.println("Defence Type: " + type4);
        System.out.println("Country: " + country4);
        System.out.println("Personnel Count: " + personnel4);
        System.out.println("Is Active: " + active4);
        System.out.println("Equipment Type: " + equipment4);
        System.out.println("Budget: $" + budget4);
        System.out.println("Year Started: "+yearEstablished4);
        System.out.println("*******Complete*********");

        Defence defence5 = new Defence();
        defence5.setDefenceType("Coast Guard");
        defence5.setCountry("Japan");
        defence5.setPersonnelCount(45000);
        defence5.setActive(true);
        defence5.setEquipmentType("Patrol Boats & Rescue Units");
        defence5.setBudget(250000);
        defence5.setYearEstablished(1989);

        String type5 = defence5.getDefenceType();
        String country5 = defence5.getCountry();
        int personnel5 = defence5.getPersonnelCount();
        boolean active5 = defence5.getActive();
        String equipment5 = defence5.getEquipmentType();
        int budget5 = defence5.getBudget();
        int yearEstablished5 = defence1.getYearEstablished();
        System.out.println("Defence Type: " + type5);
        System.out.println("Country: " + country5);
        System.out.println("Personnel Count: " + personnel5);
        System.out.println("Is Active: " + active5);
        System.out.println("Equipment Type: " + equipment5);
        System.out.println("Budget: $" + budget5);
        System.out.println("Year Started: "+yearEstablished5);
        System.out.println("*******Complete*********");

        System.out.println("Main Ended");
    }
}