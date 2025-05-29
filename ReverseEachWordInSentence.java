package org.example.String;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class ReverseEachWordInSentence {
    public static void main(String[] args) {
        String sentence = "Ramu is a Java Developer and also a Java Lead";
        ReverseEachWordInSentenceUsingLoop(sentence);
        ReverseEachWordInSentenceUsingCollections(sentence);
        ReverseEachWordInSentenceUsingStreams(sentence);
    }

    private static void ReverseEachWordInSentenceUsingStreams(String sentence) {
        String reversedWords =Arrays.stream(sentence.split("\\s+"))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println("ReverseEachWordInSentenceUsingStreams :" +reversedWords);
    }

    private static void ReverseEachWordInSentenceUsingCollections(String sentence) {
        List<String> words= Arrays.asList(sentence.trim().split("\\s"));
        String reversedWords = words.stream()
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println("ReverseEachWordInSentenceUsingCollections :"+reversedWords);
    }

    private static void ReverseEachWordInSentenceUsingLoop(String sentence) {
        String[] words = sentence.trim().split("\\s");
        StringBuilder reversedWords = new StringBuilder();
        for (String word : words) {
            reversedWords.append(new StringBuilder(word).reverse().append(" "));
            }
        reversedWords.toString().trim();
        System.out.println("ReverseEachWordInSentenceUsingLoop :"+reversedWords);
    }

    public static void reversesentensestreams(String sentence){
        String rev = Arrays.stream(sentence.trim().split("\\s"))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(""));
        System.out.println("reversesentensestreams :"+rev);

    }

}
