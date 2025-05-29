package org.example.String;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDupicatesFromList {
    public static void main(String[] args){
        List<String> duplicateList = Arrays.asList("Banana","Apple" , "Mango" , "Apple");
        RemoveDupicatesFromListUsingLoops(duplicateList);
        RemoveDupicatesFromListUsingCollections(duplicateList);
        RemoveDupicatesFromListUsingStreams(duplicateList);
        
    }

    private static void RemoveDupicatesFromListUsingStreams(List<String> duplicateList) {
       List<String> uniqueList = duplicateList.stream().distinct().collect(Collectors.toList());
       System.out.println("RemoveDupicatesFromListUsingStreams :" +uniqueList);
    }

    private static void RemoveDupicatesFromListUsingCollections(List<String> duplicateList) {
        Map<String,Boolean> uniqueMap = new LinkedHashMap<>();
        for(String item : duplicateList){
            uniqueMap.putIfAbsent(item,true);
        }
        System.out.println("RemoveDupicatesFromListUsingCollections :"+new ArrayList<>(uniqueMap.keySet()));
    }

    private static void RemoveDupicatesFromListUsingLoops(List<String> arrayList) {
        List<String> uniqueList = new ArrayList<>();
        for(String word : arrayList){
            if(!uniqueList.contains(word)){
                uniqueList.add(word);
            }
        }
        System.out.println("RemoveDupicatesFromListUsingLoops :" + uniqueList);
    }
}
