package org.example.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountWordsInSentence {
    public static void main(String[] args){
        String sentence = "Ramu is a Java Developer and also a Java Lead";
        CountWordsInSentenceUsingCollections(sentence);
        CountWordsInSentenceUsingStreams(sentence);
    }

    private static void CountWordsInSentenceUsingStreams(String sentence) {
       long count = Arrays.stream(sentence.trim().split("\\s")).count();
       System.out.println("CountWordsInSentenceUsingStreams is :"+count);
    }

    private static void CountWordsInSentenceUsingCollections(String sentence) {
        List<String> words = Arrays.asList(sentence.trim().split("\\s"));
        System.out.println("CountWordsInSentenceUsingCollections is :" + words.size());
    }
}
