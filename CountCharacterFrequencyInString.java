package org.example.String;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacterFrequencyInString {
    public static void main(String [] args){
        String str = "Banana";
        countFrequencyUsingCollections(str);
        countFrequencyUsingStreams(str);
    }

    private static void countFrequencyUsingStreams(String str) {
       Map<Character,Long> charCountMap = str.chars()
               .mapToObj(c->(char)c)
               .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
      System.out.println(charCountMap);

    }

    private static void countFrequencyUsingCollections(String str) {
        Map<Character,Integer> countCharMap = new HashMap<>();
        for(char c : str.toCharArray()){
            countCharMap.put(c,countCharMap.getOrDefault(c,0)+1);
        }
        System.out.println(countCharMap);
    }
}
