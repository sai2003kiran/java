package com.xworkz.makemytrip.booking;

import com.xworkz.makemytrip.dto.MakeMyTripDto;

public class MakeMyTripBooking {

    public boolean bookFlight(MakeMyTripDto dto) {
        boolean bookingConfirmed = false;
        boolean validated = validateBooking(dto);
        if (validated) {
            bookingConfirmed = true;
            System.out.println("Flight booking successful!");
        } else {
            System.out.println("Flight booking failed due to invalid details.");
        }
        return bookingConfirmed;
    }

    public boolean validateBooking(MakeMyTripDto dto) {
        boolean isValid = true;

        if (dto.getPassengerName() == null || dto.getPassengerName().isEmpty()) {
            System.out.println("Invalid Passenger Name");
            isValid = false;
        }

        if (dto.getEmail() == null || dto.getEmail().isEmpty()) {
            System.out.println("Invalid Email");
            isValid = false;
        }

        if (dto.getContactNumber() == null || dto.getContactNumber().isEmpty()) {
            System.out.println("Invalid Contact Number");
            isValid = false;
        }

        if (dto.getDepartureCity() == null || dto.getDepartureCity().isEmpty()) {
            System.out.println("Invalid Departure City");
            isValid = false;
        }

        if (dto.getArrivalCity() == null || dto.getArrivalCity().isEmpty()) {
            System.out.println("Invalid Arrival City");
            isValid = false;
        }

        if (dto.getTravelDate() == null || dto.getTravelDate().isEmpty()) {
            System.out.println("Invalid Travel Date");
            isValid = false;
        }

        if (dto.getNumberOfPassengers() <= 0) {
            System.out.println("Invalid Number of Passengers");
            isValid = false;
        }

        if (dto.getFare() <= 0) {
            System.out.println("Invalid Fare");
            isValid = false;
        }

        if (dto.getPaymentMethod() == null) {
            System.out.println("Invalid Payment Method");
            isValid = false;
        }

        return isValid;
    }
}
