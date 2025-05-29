package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWords {
    public static void main(String[] args) {
        String input = "Naresh is a Java developer and also a Java Lead";
        System.out.println(countWords(input));
    }

    public static Map<String,Integer> countWords(String input){
            Map<String,Integer> wordCount = new HashMap<>();
            String[] words = input.split("\\s+");
            for (String word : words){
//                wordCount.put(word,wordCount.getOrDefault(word,0)+1);
                wordCount.put(word, wordCount.getOrDefault(word,0)+1);
                if (wordCount.containsKey(word)){
                    wordCount.put(word, wordCount.get(word)+1);
            } else {
                wordCount.put(word, 1);
            }
            }
           return wordCount;
        }
     }

//        String str = "Tech Lead Java";
//        Long count = Arrays.stream(str.split("\\s")).count();
////        String inputArr[] = str.split(" "); //each word count
//        String inputArr[] = str.split(""); //each letter count
//        List<String> inputList = Arrays.asList(inputArr);
//        for(int i=0;i<inputList.size();i++)
//        {
//            System.out.println(inputList.get(i));
//        }
//        System.out.println(count);
//       Map<String,Long> countMap = inputList.stream().collect(Collectors.groupingBy(word -> word,Collectors.counting()));
//       countMap.entrySet().stream().forEach(entry -> System.out.println(entry.getKey()+"-"+entry.getValue()));
//    }


