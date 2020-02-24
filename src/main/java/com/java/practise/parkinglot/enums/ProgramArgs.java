package com.java.practise.parkinglot.enums;

public enum ProgramArgs {
    park(3),
    exit(1),
    leave(1),
    status(1),
    create_parking_lot(2),
    slot_numbers_for_cars_with_colour(2),
    slot_number_for_registration_number(2),
    registration_numbers_for_cars_with_colour(2);

    private int numberOfArgs;

    ProgramArgs(int numberOfArgs) {
        this.numberOfArgs = numberOfArgs;
    }

    public int getNumberOfArgs() {
        return numberOfArgs;
    }
}
