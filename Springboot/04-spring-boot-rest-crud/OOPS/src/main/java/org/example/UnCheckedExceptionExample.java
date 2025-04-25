package org.example;

public class UnCheckedExceptionExample extends RuntimeException{
    public static void main(String [] args){
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[4]);
        }
        catch (ArrayIndexOutOfBoundsException | NullPointerException e){
            System.out.println("Caught an unchecked exception: " + e.getClass().getSimpleName());
        }
    }
}
