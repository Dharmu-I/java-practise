package com.java.practise.parkinglot.exceptions;

public class InvalidNumberOfArgumentException extends Exception {
    public InvalidNumberOfArgumentException(String message) {
        super(message);
    }

    public InvalidNumberOfArgumentException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
