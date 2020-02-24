package com.java.practise.parkinglot.repos;

import com.java.practise.parkinglot.entities.Ticket;
import com.java.practise.parkinglot.utils.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

public class TicketRepo {

    private static TicketRepo ticketRepo;

    private final List<Ticket> tickets;

    private TicketRepo() {
        this.tickets = new ArrayList<>();
    }

    public static TicketRepo getTicketRepoInstance() {
        if (ObjectUtils.isNullObject(ticketRepo)) {
            ticketRepo = new TicketRepo();
        }
        return ticketRepo;
    }

    public void addTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }
}
