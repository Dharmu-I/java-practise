package com.games.exceptions;

public class DataAccessException extends Exception {

    DataAccessException(String message, Throwable throwable) {
        super(message, throwable);
    }

    DataAccessException(String message) {
        super(message);
    }
}
