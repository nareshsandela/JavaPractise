package org.example.String;

public class RemoveDigitsFromString {
    public static void  main(String args[]){
        String str ="abc1d2e4";
        StringBuilder results = new StringBuilder();
        for(char c : str.toCharArray()){
            if(!Character.isDigit(c)){  //to print charecters in results
//                if(Character.isDigit(c)){ //to print number in results
                results.append(c);
            }
        }
        System.out.println(results);
    }
}
