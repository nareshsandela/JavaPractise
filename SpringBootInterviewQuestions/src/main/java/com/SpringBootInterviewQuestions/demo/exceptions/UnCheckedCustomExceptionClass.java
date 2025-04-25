package com.SpringBootInterviewQuestions.demo.exceptions;

public class UnCheckedCustomExceptionClass extends RuntimeException{
    private int statusCode;


    public UnCheckedCustomExceptionClass(ErrorCodes errorCodes) {
        super(errorCodes.getMessage());
        this.statusCode= errorCodes.getStatusCode();
    }
    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
