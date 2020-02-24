package com.java.practise.parkinglot.exceptions;

public class InvalidVehicleTypeException extends Exception {

    public InvalidVehicleTypeException(String message) {
        super(message);
    }

    public InvalidVehicleTypeException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
