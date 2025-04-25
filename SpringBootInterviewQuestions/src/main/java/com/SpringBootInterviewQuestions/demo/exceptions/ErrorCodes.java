package com.SpringBootInterviewQuestions.demo.exceptions;

public enum ErrorCodes {
    NEGATIVE_AMOUNT("Amount must be greater than 0 : ",400),
    EXCEEDED_AMOUNT("Amount must not be greater than 1,00,000 : ", 409);

    private final String message;
    private final int statusCode;

    public String getMessage() {
        return message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    ErrorCodes(String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }
}
