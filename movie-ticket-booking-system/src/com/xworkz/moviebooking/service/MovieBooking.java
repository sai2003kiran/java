package com.xworkz.moviebooking.service;

import com.xworkz.moviebooking.dto.MovieBookingDto;

public class MovieBooking {

    public boolean bookTicket(MovieBookingDto dto) {
        boolean isBookingSuccessful = false;
        boolean validated = validateBooking(dto);
        if (validated) {
            isBookingSuccessful = true;
            System.out.println("Ticket Booking Successful!");
        } else {
            System.out.println("Ticket Booking Failed due to invalid details.");
        }
        return isBookingSuccessful;
    }

    public boolean validateBooking(MovieBookingDto dto) {
        boolean userNameValid = false;
        boolean emailValid = false;
        boolean mobileValid = false;
        boolean movieNameValid = false;
        boolean theatreNameValid = false;
        boolean showTimeValid = false;
        boolean numberOfTicketsValid = false;
        boolean seatTypeValid = false;

        if (dto.getUserName() != null && !dto.getUserName().isEmpty()) {
            userNameValid = true;
        } else {
            System.out.println("Invalid Username!!");
        }

        if (dto.getEmail() != null && !dto.getEmail().isEmpty()) {
            emailValid = true;
        } else {
            System.out.println("Invalid Email!!");
        }

        if (dto.getMobile() != null && !dto.getMobile().isEmpty()) {
            mobileValid = true;
        } else {
            System.out.println("Invalid Mobile Number!!");
        }

        if (dto.getMovieName() != null && !dto.getMovieName().isEmpty()) {
            movieNameValid = true;
        } else {
            System.out.println("Invalid Movie Name!!");
        }

        if (dto.getTheatreName() != null && !dto.getTheatreName().isEmpty()) {
            theatreNameValid = true;
        } else {
            System.out.println("Invalid Theatre Name!!");
        }

        if (dto.getShowTime() != null && !dto.getShowTime().isEmpty()) {
            showTimeValid = true;
        } else {
            System.out.println("Invalid Show Time!!");
        }

        if (dto.getNumberOfTickets() > 0) {
            numberOfTicketsValid = true;
        } else {
            System.out.println("Invalid Number of Tickets!!");
        }

        if (dto.getSeatType() != null && !dto.getSeatType().isEmpty()) {
            seatTypeValid = true;
        } else {
            System.out.println("Invalid Seat Type!!");
        }

        return userNameValid && emailValid && mobileValid && movieNameValid &&
                theatreNameValid && showTimeValid && numberOfTicketsValid && seatTypeValid;
    }
}
