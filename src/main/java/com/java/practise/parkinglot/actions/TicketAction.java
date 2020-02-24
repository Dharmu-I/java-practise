package com.java.practise.parkinglot.actions;

import com.java.practise.parkinglot.entities.Ticket;
import com.java.practise.parkinglot.repos.TicketRepo;

public class TicketAction {

    private final TicketRepo ticketRepo = TicketRepo.getTicketRepoInstance();

    public Ticket generateAndTicketToRepo(int slotNumber, String vehicleNumber) {
        Ticket ticket = generateTicket(slotNumber, vehicleNumber);
        ticketRepo.addTicket(ticket);
        return ticket;
    }

    private Ticket generateTicket(int slotNumber, String vehicleNumber) {
        return Ticket.builder()
                .parkingSlotNumber(slotNumber)
                .vehicleNumber(vehicleNumber)
                .build();
    }
}
