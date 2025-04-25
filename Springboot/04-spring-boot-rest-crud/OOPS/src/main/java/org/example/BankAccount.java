package org.example;

public class BankAccount {
    int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void addAmount(int amount) {
        if (amount<0){
            throw new UnCheckedCustomException("Amount should be greater than 0", 400);
        }
        if (amount>100000){
            throw new UnCheckedCustomException("Amount should be not be greater than 100000", 409);
        }
        else{
            //custom logic to add amount
            System.out.println("Amount credited successfully" + amount + 200);
        }
    }
}
