package com.games.exceptions;

public class UserNotFoundException extends Exception {

    UserNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public UserNotFoundException(String message) {
        super(message);
    }
}
