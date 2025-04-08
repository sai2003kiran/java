package com.xworkz.trainticket.servicetrain;

import com.xworkz.trainticket.ticketdto.TrainTicketDto;

public class TrainTicketService {

    public boolean bookTicket(TrainTicketDto dto) {
        boolean isValid = validateTicket(dto);
        if (isValid) {
            System.out.println("Ticket booked successfully!");
            return true;
        } else {
            System.out.println("Ticket booking failed due to invalid data.");
            return false;
        }
    }

    private boolean validateTicket(TrainTicketDto dto) {
        boolean passengerValid = dto.getPassengerName() != null && !dto.getPassengerName().isEmpty();
        boolean departureValid = dto.getDepartureStation() != null && !dto.getDepartureStation().isEmpty();
        boolean arrivalValid = dto.getArrivalStation() != null && !dto.getArrivalStation().isEmpty();
        boolean dateValid = dto.getJourneyDate() != null && !dto.getJourneyDate().isEmpty();
        boolean classValid = dto.getTicketClass() != null;
        boolean countValid = dto.getNumberOfPassengers() > 0;
        boolean contactValid = dto.getContactNumber() != null && !dto.getContactNumber().isEmpty();
        boolean emailValid = dto.getEmail() != null && !dto.getEmail().isEmpty();

        if (!passengerValid)
            System.out.println("Invalid Passenger Name!");
        if (!departureValid)
            System.out.println("Invalid Departure Station!");
        if (!arrivalValid)
            System.out.println("Invalid Arrival Station!");
        if (!dateValid)
            System.out.println("Invalid Journey Date!");
        if (!classValid)
            System.out.println("Invalid Ticket Class!");
        if (!countValid)
            System.out.println("Invalid Number of Passengers!");
        if (!contactValid)
            System.out.println("Invalid Contact Number!");
        if (!emailValid)
            System.out.println("Invalid Email!");

        return passengerValid && departureValid && arrivalValid && dateValid &&
                classValid && countValid && contactValid && emailValid;
    }
}
