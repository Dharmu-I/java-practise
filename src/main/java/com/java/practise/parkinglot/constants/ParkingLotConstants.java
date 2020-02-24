package com.java.practise.parkinglot.constants;

public class ParkingLotConstants {

    private ParkingLotConstants() {
    }

    public static class Responses {
        private Responses() {
        }

        public static final String NO_EMPTY_PARKING = "Sorry, parking lot is full";
        public static final String SUCCESSFULLY_VEHICLE_PARKED = "Allocated slot number: %s";
        public static final String FREE_THE_SLOT = "Slot number %s is free";
        public static final String SUCCESSFUL_SLOT_CREATION = "Created a parking lot with %s slots";
        public static final String NOT_FOUND = "Not found";
    }
}
