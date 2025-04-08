package com.xworkz.moviebooking;

import com.xworkz.moviebooking.dto.MovieBookingDto;
import com.xworkz.moviebooking.service.MovieBooking;

public class MovieBookingRunner {

    public static void main(String[] args) {

        System.out.println("----- Booking Movie Ticket -----");

        MovieBookingDto dto = new MovieBookingDto();
        dto.setUserName("Akhil Raj");
        dto.setEmail("akhilraj@gmail.com");
        dto.setMobile("9876543210");
        dto.setMovieName("Interstellar");
        dto.setTheatreName("PVR Koramangala");
        dto.setShowTime("07:00 PM");
        dto.setNumberOfTickets(2);
        dto.setSeatType("Gold");

        System.out.println("User Name: " + dto.getUserName());
        System.out.println("Email: " + dto.getEmail());
        System.out.println("Mobile: " + dto.getMobile());
        System.out.println("Movie: " + dto.getMovieName());
        System.out.println("Theatre: " + dto.getTheatreName());
        System.out.println("Show Time: " + dto.getShowTime());
        System.out.println("Tickets: " + dto.getNumberOfTickets());
        System.out.println("Seat Type: " + dto.getSeatType());

        System.out.println("--------------------------------");

        MovieBooking booking = new MovieBooking();
        booking.bookTicket(dto);
    }
}
