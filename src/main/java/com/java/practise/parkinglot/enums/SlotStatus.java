package com.java.practise.parkinglot.enums;

public enum SlotStatus {
    // Empty status
    FREE,
    // Once the vehicle is parked
    OCCUPIED,
    // For future purpose
    RESERVED;

    public boolean isAvailable() {
        return SlotStatus.FREE.equals(this);
    }
}
