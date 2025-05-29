package org.example.String;

public class Palindrome {
    public static void main(String args[]){
        String str = "madam";
        StringBuilder obj = new StringBuilder(str);
     System.out.println(str.equals(obj.reverse().toString()));
    }
}