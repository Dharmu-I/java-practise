package com.games.exceptions;

public class InvalidRequestException extends Exception {

    public InvalidRequestException(String message, Throwable throwable){
        super(message, throwable);
    }

    public InvalidRequestException(String message){
        super(message);
    }
}
