package com.java.practise.parkinglot.entities;

import lombok.Builder;

@Builder
public class Ticket {

    private String vehicleNumber;

    private int parkingSlotNumber;

}
