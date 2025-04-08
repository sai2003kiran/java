package com.xworkz.trainticket;

import com.xworkz.trainticket.constants.TicketClass;
import com.xworkz.trainticket.ticketdto.TrainTicketDto;
import com.xworkz.trainticket.servicetrain.TrainTicketService;

public class TrainTicketRunner {

    public static void main(String[] args) {

        TrainTicketDto dto = new TrainTicketDto();
        dto.setPassengerName("Ravi Kumar");
        dto.setDepartureStation("Bangalore");
        dto.setArrivalStation("Hyderabad");
        dto.setJourneyDate("12/04/2025");
        dto.setTicketClass(TicketClass.AC);
        dto.setNumberOfPassengers(2);
        dto.setContactNumber("9876543210");
        dto.setEmail("ravi.kumar@example.com");

        System.out.println("----- Passenger Ticket Info -----");
        System.out.println("Name: " + dto.getPassengerName());
        System.out.println("From: " + dto.getDepartureStation());
        System.out.println("To: " + dto.getArrivalStation());
        System.out.println("Date: " + dto.getJourneyDate());
        System.out.println("Class: " + dto.getTicketClass());
        System.out.println("No. of Passengers: " + dto.getNumberOfPassengers());
        System.out.println("Contact: " + dto.getContactNumber());
        System.out.println("Email: " + dto.getEmail());

        System.out.println("----------------------------------");

        TrainTicketService service = new TrainTicketService();
        service.bookTicket(dto);
    }
}
