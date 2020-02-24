package com.java.practise.parkinglot.entities;

import lombok.*;

@Getter
@Builder
public class ParkingSlot {

    private int id;

    private boolean available;

    public void allocateSlot() {
        this.available = Boolean.FALSE;
    }

    public void freeTheSlot() {
        this.available = Boolean.TRUE;
    }
}
