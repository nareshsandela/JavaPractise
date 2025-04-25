package org.example;

public class UnCheckedCustomExceptionMain {
    public static void main(String args[]){
      try {
          BankAccount bankAccount = new BankAccount();
          bankAccount.addAmount(20000000);
      }
      catch (UnCheckedCustomException e){
          System.out.println("Error Message: " + e.getMessage());
          System.out.println("Status Code: " + e.getStatusCode());
      }
    }
}
