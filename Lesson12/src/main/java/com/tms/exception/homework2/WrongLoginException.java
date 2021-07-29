package com.tms.exception.homework2;

public class WrongLoginException extends RuntimeException {

    public WrongLoginException(String message) {
        super(message);
    }
}
