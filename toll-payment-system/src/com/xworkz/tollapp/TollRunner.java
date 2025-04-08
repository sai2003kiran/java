package com.xworkz.tollapp;

import com.xworkz.tollapp.constants.VehicleType;
import com.xworkz.tollapp.constants.PaymentMode;
import com.xworkz.tollapp.tolldto.TollDto;
import com.xworkz.tollapp.generatetoll.Toll;

public class TollRunner {

    public static void main(String[] args) {

        System.out.println("----------------------------------");

        TollDto dto = new TollDto();
        dto.setVehicleNumber("KA01AB1234");
        dto.setDriverName("Ravi Kumar");
        dto.setVehicleType(VehicleType.TRUCK);
        dto.setTollAmount(150.00);
        dto.setTollBoothLocation("Electronic City Toll Plaza");
        dto.setDate("2025-04-08");
        dto.setPaymentMode(PaymentMode.CARD);

        System.out.println("Vehicle Number: " + dto.getVehicleNumber());
        System.out.println("Driver Name: " + dto.getDriverName());
        System.out.println("Vehicle Type: " + dto.getVehicleType());
        System.out.println("Toll Amount: " + dto.getTollAmount());
        System.out.println("Toll Booth: " + dto.getTollBoothLocation());
        System.out.println("Date: " + dto.getDate());
        System.out.println("Payment Mode: " + dto.getPaymentMode());

        System.out.println("----------------------------------");

        Toll toll = new Toll();
        toll.makePayment(dto);
    }
}
