package org.example.String;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class GetAllSubStrings {
    public static void main(String args[]){
        String str = "aaabbc";
        getAllSubStringsUsingCollections(str);
    }

    private static void getAllSubStringsUsingCollections(String str) {
        List<String> subStringsList = new ArrayList<>(); // duplicate substrings like a,aa,aab etc are included in response
        HashSet<String> subStringsSet = new HashSet<>(); // duplicate substrings like a,aa,aab etc are excluded in response
        for (int i=0 ; i<str.length() ; i++){
            for (int j=i+1 ; j<=str.length(); j++){
                subStringsList.add(str.substring(i,j));
                subStringsSet.add(str.substring(i,j));
            }
        }
        System.out.println("getAllSubStringsUsingCollections non unique substrings : " + subStringsList);
        System.out.println("getAllSubStringsUsingCollections unique substrings : " + subStringsSet);
        List<String> subStringLists = new ArrayList<>(subStringsSet);
        subStringLists = subStringLists.stream().sorted(Comparator.comparing(String::length)
                .thenComparing(Comparator.naturalOrder())).toList();
        System.out.println("getAllSubStringsUsingCollections unique substrings in sorted order: " + subStringLists);
    }
}
