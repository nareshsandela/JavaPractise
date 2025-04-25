package com.SpringBootInterviewQuestions.demo.controller;

import com.SpringBootInterviewQuestions.demo.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/bankAccount")
public class BankAccountController {


    private BankService bankService;

    @Autowired
    public BankAccountController(BankService bankService){
        this.bankService=bankService;
    }

    @PostMapping("/addAmount")
    public ResponseEntity<ApiResponse> addAmount(@RequestParam int amount){
      bankService.addAmount(amount);
        ApiResponse response = new ApiResponse("200", "Amount successfully added/credited");
        return ResponseEntity.ok(response);
    }
}
