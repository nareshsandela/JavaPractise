package org.example;

public class CustomCheckedExceptionMain {



    public static void main(String args[]) {
        try {
        Person person = new Person();
        person.checkEligibility(17,"Suresh","Male");
        person.displayDetails();
        }
        catch (CustomCheckedException e) {
            System.out.println("Exception caught: "+e.getMessage());
        }
    }
}