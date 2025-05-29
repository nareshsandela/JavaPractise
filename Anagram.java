package org.example.String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {
    public static void main(String [] args){
        String str1 = "listen";
        String str2 = "silent";
        isAnagramUsingLoops(str1,str2);
        isAnagramUsingCollections(str1,str2);
        isAnagramUsingStreams(str1,str2);
    }

    private static void isAnagramUsingStreams(String str1, String str2) {
        if(str1.length()!= str2.length()){
            System.out.println("Not an Anagram");
            return;
        }

        boolean isAnagram = str1.chars().sorted()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining())
                .equals(
                        str2.chars().sorted()
                                .mapToObj(c -> String.valueOf((char) c))
                                .collect(Collectors.joining())
                );
        System.out.println(isAnagram ? "isAnagramUsingStreams is Anagram" : "isAnagramUsingStreams is Not Anagram");
    }

    private static void isAnagramUsingCollections(String str1, String str2) {
        if(str1.length()!= str2.length()){
            System.out.println("Not an Anagram");
        }

        Map<Character,Integer> charCountMap = new HashMap<>();
        for(char c : str1.toCharArray()){
            charCountMap.put(c,charCountMap.getOrDefault(c,0)+1);
        }
        for(char c :str2.toCharArray()){
                charCountMap.put(c,charCountMap.getOrDefault(c,0)-1);
                if(charCountMap.get(c)<0){
                    System.out.println("isAnagramUsingCollections is Not Anagrams");
                    return;
                }
            }
            System.out.println("isAnagramUsingCollections is Anagrams");
        }

    public static void isAnagramUsingLoops(String str1,String str2){
        if(str1.length()!=str2.length()){
            System.out.println("isAnagramUsingLoops is Not Anagrams");
        }
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);
        if(Arrays.equals(char1,char2)){
            System.out.println("isAnagramUsingLoops is Anagram");
        }
        else {
            System.out.println("isAnagramUsingLoops is Not an Anagram");
        }
    }
}
