package org.example.String;

import java.util.*;

public class LongestWordInSentence {
    public static void main(String[] args) {
        String sentence = "Ramu is a Java Developer and also a Java Lead";
        LongestWordInSentenceUsingLoop(sentence);
        LongestWordInSentenceUsingCollections(sentence);
        LongestWordInSentenceUsingStreams(sentence);
    }

    private static void LongestWordInSentenceUsingStreams(String sentence) {
       String longestWord = Arrays.stream(sentence.trim().split("\\s+"))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
       System.out.println("LongestWordInSentenceUsingStreams :" +longestWord);
    }

    private static void LongestWordInSentenceUsingCollections(String sentence) {
        List<String> words= Arrays.asList(sentence.trim().split("\\s"));
       String longestWord = Collections.max(words, Comparator.comparing(String::length));
        System.out.println("LongestWordInSentenceUsingCollections :"+longestWord);
    }

    private static void LongestWordInSentenceUsingLoop(String sentence) {
        String[] words = sentence.trim().split("\\s");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("LongestWordInSentenceUsingLoop :"+longestWord);
    }
}
