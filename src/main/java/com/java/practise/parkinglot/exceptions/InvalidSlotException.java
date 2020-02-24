package com.java.practise.parkinglot.exceptions;

public class InvalidSlotException extends Exception {
    public InvalidSlotException(String message) {
        super(message);
    }

    public InvalidSlotException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
