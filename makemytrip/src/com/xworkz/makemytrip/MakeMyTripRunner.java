package com.xworkz.makemytrip;

import com.xworkz.makemytrip.constants.PaymentMethod;
import com.xworkz.makemytrip.dto.MakeMyTripDto;
import com.xworkz.makemytrip.booking.MakeMyTripBooking;

public class MakeMyTripRunner {

    public static void main(String[] args) {

        MakeMyTripDto dto = new MakeMyTripDto();
        dto.setPassengerName("Rohit Sharma");
        dto.setEmail("rohit.sharma@gmail.com");
        dto.setContactNumber("9998887776");
        dto.setDepartureCity("Bangalore");
        dto.setArrivalCity("Delhi");
        dto.setTravelDate("2025-04-20");
        dto.setNumberOfPassengers(2);
        dto.setFare(7599.99);
        dto.setPaymentMethod(PaymentMethod.CREDIT_CARD);

        System.out.println("Passenger Name: " + dto.getPassengerName());
        System.out.println("Email: " + dto.getEmail());
        System.out.println("Contact Number: " + dto.getContactNumber());
        System.out.println("From: " + dto.getDepartureCity());
        System.out.println("To: " + dto.getArrivalCity());
        System.out.println("Travel Date: " + dto.getTravelDate());
        System.out.println("Number of Passengers: " + dto.getNumberOfPassengers());
        System.out.println("Fare: " + dto.getFare());
        System.out.println("Payment Method: " + dto.getPaymentMethod());

        System.out.println("----------------------------------");

        MakeMyTripBooking booking = new MakeMyTripBooking();
        booking.bookFlight(dto);
    }
}
