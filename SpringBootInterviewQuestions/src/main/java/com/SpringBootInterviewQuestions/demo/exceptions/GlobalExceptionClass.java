package com.SpringBootInterviewQuestions.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionClass  {

    @ExceptionHandler(UnCheckedCustomExceptionClass.class)
    public ResponseEntity<String> handleCustomException(UnCheckedCustomExceptionClass ex){
        HttpStatus status = HttpStatus.resolve(ex.getStatusCode());
             if(status==null){
                  status=HttpStatus.BAD_REQUEST;
             }
         return new ResponseEntity<>(ex.getMessage(),status);
    }

    public ResponseEntity<String> handleGenericException(UnCheckedCustomExceptionClass e){
       return  new ResponseEntity<>("Unexpected Internal server error" +  e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
