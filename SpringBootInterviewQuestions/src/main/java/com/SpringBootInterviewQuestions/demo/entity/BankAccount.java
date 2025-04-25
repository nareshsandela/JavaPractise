package com.SpringBootInterviewQuestions.demo.entity;

public class BankAccount {
    String accountHoldername;
    int accountNumber;
    double amount;

    public String getAccountHoldername() {
        return accountHoldername;
    }

    public BankAccount() {
    }

    public BankAccount(String accountHoldername, int accountNumber, double amount) {
        this.accountHoldername = accountHoldername;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public void setAccountHoldername(String accountHoldername) {
        this.accountHoldername = accountHoldername;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
