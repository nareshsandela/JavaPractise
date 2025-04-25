package org.example;

public class UnCheckedCustomException extends RuntimeException{
    private int statusCode;
    public UnCheckedCustomException() {
    }

    public UnCheckedCustomException(String message) {
        super(message);
    }

    public UnCheckedCustomException(String message,int statusCode){
        super(message);
        this.statusCode=statusCode;
    }

    public UnCheckedCustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnCheckedCustomException(Throwable cause) {
        super(cause);
    }

    public UnCheckedCustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public int getStatusCode() {
      return statusCode;
    }
}
