package org.example;

public class CustomCheckedException extends Exception {
    public CustomCheckedException() {
    }

    public CustomCheckedException(String message) {
        super(message);
    }
}
