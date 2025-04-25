package com.SpringBootInterviewQuestions.demo.serviceImpl;

import com.SpringBootInterviewQuestions.demo.exceptions.ErrorCodes;
import com.SpringBootInterviewQuestions.demo.exceptions.UnCheckedCustomExceptionClass;
import com.SpringBootInterviewQuestions.demo.service.BankService;
import org.springframework.stereotype.Service;

import java.io.UncheckedIOException;

@Service
public class BankSerivceImpl implements BankService {

    @Override
    public void addAmount(int amount){
        //custom logic

        if(amount<0){
            throw new UnCheckedCustomExceptionClass(ErrorCodes.NEGATIVE_AMOUNT);
        }
        if(amount>100000){
            throw new UnCheckedCustomExceptionClass(ErrorCodes.EXCEEDED_AMOUNT);
        }
        System.out.println("Amount added successfully Rs: " + amount);
    }
}
