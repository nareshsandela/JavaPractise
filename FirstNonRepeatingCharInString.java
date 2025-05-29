package org.example.String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharInString {
    public static void main(String[] args) {
        String str = "iwissw";
        firstNonRepeatingCharUsingCollections(str);
        firstNonRepeatingCharUsingStreams(str);
    }

    public static void firstNonRepeatingCharUsingCollections(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First Non repeating character is :" + entry.getKey());
                return;
            }
        }
        System.out.println("No Non repeting character found");
    }

    public static void firstNonRepeatingCharUsingStreams(String str){
        Optional<Character> firstNonRepeatedChar = str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(entry->entry.getValue()==1)
                .map(entry->entry.getKey())    //  .map(Map.Entry::getKey)
                .findFirst();

        firstNonRepeatedChar.ifPresentOrElse(
                ch->System.out.println("First Non Repeated character is : " + ch),
                ()-> System.out.println("No Non Repeated character found"));
    }
}


