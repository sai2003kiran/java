package com.xworkz.tollapp.generatetoll;

import com.xworkz.tollapp.tolldto.TollDto;

public class Toll {

    public boolean makePayment(TollDto dto) {
        boolean paymentDone = false;
        boolean validated = validatePayment(dto);
        if (validated) {
            paymentDone = true;
            System.out.println("Toll payment successful!");
        } else {
            System.out.println("Toll payment failed due to validation errors.");
        }
        return paymentDone;
    }

    public boolean validatePayment(TollDto dto) {
        boolean paymentValidated = false;

        boolean vehicleNumberValid = false;
        boolean driverNameValid = false;
        boolean vehicleTypeValid = false;
        boolean tollAmountValid = false;
        boolean tollBoothValid = false;
        boolean dateValid = false;
        boolean paymentModeValid = false;

        if (dto.getVehicleNumber() != null && !dto.getVehicleNumber().isEmpty()) {
            vehicleNumberValid = true;
        } else {
            System.out.println("Invalid Vehicle Number!");
        }

        if (dto.getDriverName() != null && !dto.getDriverName().isEmpty()) {
            driverNameValid = true;
        } else {
            System.out.println("Invalid Driver Name!");
        }

        if (dto.getVehicleType() != null) {
            vehicleTypeValid = true;
        } else {
            System.out.println("Invalid Vehicle Type!");
        }

        if (dto.getTollAmount() > 0) {
            tollAmountValid = true;
        } else {
            System.out.println("Invalid Toll Amount!");
        }

        if (dto.getTollBoothLocation() != null && !dto.getTollBoothLocation().isEmpty()) {
            tollBoothValid = true;
        } else {
            System.out.println("Invalid Toll Booth Location!");
        }

        if (dto.getDate() != null && !dto.getDate().isEmpty()) {
            dateValid = true;
        } else {
            System.out.println("Invalid Date!");
        }

        if (dto.getPaymentMode() != null) {
            paymentModeValid = true;
        } else {
            System.out.println("Invalid Payment Mode!");
        }

        if (vehicleNumberValid && driverNameValid && vehicleTypeValid && tollAmountValid &&
                tollBoothValid && dateValid && paymentModeValid) {
            paymentValidated = true;
        }

        return paymentValidated;
    }
}
