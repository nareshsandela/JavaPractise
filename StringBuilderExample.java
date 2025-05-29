package org.example.String;

public class StringBuilderExample {
    public static void main(String args[]){
        String str = "madam";
        isPalindrome(str);//check if palindrome

        String str1 = "a1b2c3d4";
        removeDigits(str1);//to remove digits in string

        String str2 = "Hello Java Developer";
        vowelCount(str2);

    }

    private static void vowelCount(String str2) {
        String vowels = "aeiou";
        int count = 0;
        for(char c : str2.toLowerCase().toCharArray()){
            if(vowels.indexOf(c)!=-1){
                count++;
            }
        }
        System.out.println("vowelCount is : "+count);
    }

    private static void removeDigits(String str1) {
        StringBuilder obj = new StringBuilder();
        for (char c : str1.toCharArray()){
            if(!Character.isDigit(c)){
                obj.append(c);
            }
        }
        System.out.println("removeDigits : "+obj);
    }

    private static void isPalindrome(String str) {
        StringBuilder obj = new StringBuilder(str);
        System.out.println(str.equals(obj.reverse().toString()));
    }
}
