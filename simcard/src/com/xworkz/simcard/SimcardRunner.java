package com.xworkz.simcard;

import com.xworkz.simcard.sim.SimCard;

public class SimcardRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        SimCard sim1 = new SimCard();
        sim1.setSimType("4G");
        sim1.setNetworkProvider("Airtel");
        sim1.setPhoneNumber(9876543210L);
        sim1.setPrepaid(true);
        sim1.setDataBalance(20);
        sim1.setActivationDate("2025-04-01");
        sim1.setPlanName("Unlimited Data Plan");
        String simType1 = sim1.getSimType();
        System.out.println("Sim Type: " + simType1);
        String networkProvider1 = sim1.getNetworkProvider();
        System.out.println("Phone Number: " + networkProvider1);
        long phoneNumber1 = sim1.getPhoneNumber();
        System.out.println("Data Limit: " + phoneNumber1 + " GB");
        boolean prepaid1 = sim1.getPrepaid();
        System.out.println("Prepaid status: " + prepaid1);
        int dataBalance1 = sim1.getDataBalance();
        System.out.println("Is Active: " + dataBalance1);
        String activationDate1 = sim1.getActivationDate();
        System.out.println("Sim Type: " + activationDate1);
        String planName1 = sim1.getPlanName();
        System.out.println("Sim Type: " + planName1);
        System.out.println("*******Complete*********");


        SimCard sim2 = new SimCard();
        sim2.setSimType("5G");
        sim2.setNetworkProvider("Jio");
        sim2.setPhoneNumber(9876543211L);
        sim2.setPrepaid(false);
        sim2.setDataBalance(50);
        sim2.setActivationDate("2025-03-15");
        sim2.setPlanName("Premium Data Plan");
        String simType2 = sim2.getSimType();
        System.out.println("Sim Type: " + simType2);
        String networkProvider2 = sim2.getNetworkProvider();
        System.out.println("Phone Number: " + networkProvider2);
        long phoneNumber2 = sim2.getPhoneNumber();
        System.out.println("Data Limit: " + phoneNumber2 + " GB");
        boolean prepaid2 = sim2.getPrepaid();
        System.out.println("Prepaid status: " + prepaid2);
        int dataBalance2 = sim2.getDataBalance();
        System.out.println("Is Active: " + dataBalance2);
        String activationDate2 = sim2.getActivationDate();
        System.out.println("Sim Type: " + activationDate2);
        String planName2 = sim2.getPlanName();
        System.out.println("Sim Type: " + planName2);
        System.out.println("*******Complete*********");


        SimCard sim3 = new SimCard();
        sim3.setSimType("3G");
        sim3.setNetworkProvider("BSNL");
        sim3.setPhoneNumber(9876543212L);
        sim3.setPrepaid(true);
        sim3.setDataBalance(5);
        sim3.setActivationDate("2024-12-25");
        sim3.setPlanName("Basic Data Plan");
        String simType3 = sim3.getSimType();
        System.out.println("Sim Type: " + simType3);
        String networkProvider3 = sim3.getNetworkProvider();
        System.out.println("Phone Number: " + networkProvider3);
        long phoneNumber3 = sim3.getPhoneNumber();
        System.out.println("Data Limit: " + phoneNumber3 + " GB");
        boolean prepaid3= sim3.getPrepaid();
        System.out.println("Prepaid status: " + prepaid3);
        int dataBalance3 = sim3.getDataBalance();
        System.out.println("Is Active: " + dataBalance3);
        String activationDate3 = sim3.getActivationDate();
        System.out.println("Sim Type: " + activationDate3);
        String planName3 = sim3.getPlanName();
        System.out.println("Sim Type: " + planName3);
        System.out.println("*******Complete*********");


        SimCard sim4 = new SimCard();
        sim4.setSimType("eSIM");
        sim4.setNetworkProvider("Vodafone");
        sim4.setPhoneNumber(9876543213L);
        sim4.setPrepaid(false);
        sim4.setDataBalance(40);
        sim4.setActivationDate("2025-01-10");
        sim4.setPlanName("Enterprise Plan");
        String simType4 = sim4.getSimType();
        System.out.println("Sim Type: " + simType4);
        String networkProvider4 = sim4.getNetworkProvider();
        System.out.println("Phone Number: " + networkProvider4);
        long phoneNumber4 = sim4.getPhoneNumber();
        System.out.println("Data Limit: " + phoneNumber4 + " GB");
        boolean prepaid12= sim4.getPrepaid();
        System.out.println("Price: $" + prepaid1);
        int dataBalance4 = sim4.getDataBalance();
        System.out.println("Is Active: " + dataBalance4);
        String activationDate4 = sim4.getActivationDate();
        System.out.println("Sim Type: " + activationDate4);
        String planName4 = sim4.getPlanName();
        System.out.println("Sim Type: " + planName4);
        System.out.println("*******Complete*********");

        SimCard sim5 = new SimCard();
        sim5.setSimType("4G");
        sim5.setNetworkProvider("Idea");
        sim5.setPhoneNumber(9876543214L);
        sim5.setPrepaid(true);
        sim5.setDataBalance(10);
        sim5.setActivationDate("2025-02-01");
        sim5.setPlanName("Student Plan");
        String simType5 = sim5.getSimType();
        System.out.println("Sim Type: " + simType5);
        String networkProvider5 = sim5.getNetworkProvider();
        System.out.println("Phone Number: " + networkProvider5);
        long phoneNumber5 = sim5.getPhoneNumber();
        System.out.println("Data Limit: " + phoneNumber5 + " GB");
        boolean prepaid5= sim5.getPrepaid();
        System.out.println("Prepaid status: " + prepaid5);
        int dataBalance5 = sim5.getDataBalance();
        System.out.println("Is Active: " + dataBalance5);
        String activationDate5 = sim5.getActivationDate();
        System.out.println("Sim Type: " + activationDate5);
        String planName5 = sim5.getPlanName();
        System.out.println("Sim Type: " + planName5);
        System.out.println("*******Complete*********");




        System.out.println("main ended");
    }
}
