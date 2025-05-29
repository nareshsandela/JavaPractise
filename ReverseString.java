package org.example.String;


import javax.swing.plaf.synth.SynthTextAreaUI;
import java.awt.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// #1) Write a Java Program to reverse a string without using String inbuilt function.
public class ReverseString {
//    private static String input;

    public static void main(String[] args) {
        String str = "NareshK";
        reverseString(str);
        reverseStringUsingStreams(str);
        usingStreams(str);
    }

    private static void reverseStringUsingStreams(String str) {
       String reversedString =  IntStream.range(0,str.length())
                .mapToObj(i->str.charAt(str.length()-1-i))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println("reverseStringUsingStreams : "+reversedString);
    }

    IntStr
//    public static void reverseString(String str) {
//        char[] chars = str.toCharArray();
//        int left = 0;
//        int right = str.length() - 1;
//        while (left < right) {
//            char temp = chars[left];
//            chars[left] = chars[right];
//            chars[right] = temp;
//            left++;
//            right--;
//        }
//        System.out.println(chars);
//    }

    public static void reverseString(String str){
       char[] chars = str.toCharArray();
       int left =0;
       int right = str.length()-1;
       while (left<right){
       char temp = chars[left];
       chars[left] = chars[right];
       chars[right] = temp;
       left++;
       right--;
       }
       System.out.println("reverseString :"+ String.valueOf(chars));
    }

    public static void usingStreams(String str){
        String revsereString = IntStream.range(0,str.length())
                .mapToObj(i->str.charAt(str.length()-1-i))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println("Reversed string using streams : "+revsereString);
    }

    public static void reverseAStringUsingStreams(String str){
      String revstring=  IntStream.range(0,str.length())
              .mapToObj(i->str.charAt(str.length()-1-i))
              .map(String::valueOf)
              .collect(Collectors.joining());
    }

}
