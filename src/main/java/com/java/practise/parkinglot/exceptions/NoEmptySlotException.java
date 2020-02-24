package com.java.practise.parkinglot.exceptions;

public class NoEmptySlotException extends Exception {

    public NoEmptySlotException(String message) {
        super(message);
    }

    public NoEmptySlotException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
