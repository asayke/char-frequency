package com.asayke.exception;

public class InputStringIsEmptyException extends RuntimeException {
    public InputStringIsEmptyException(String message) {
        super(message);
    }
}