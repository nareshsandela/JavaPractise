package org.example.String;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DupicateElementsInList {
    public static void main(String [] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 6, 4, 7, 8, 8, 9, 1);
        DupicateElementsInListUsingStreams(numbers);
    }

    private static void DupicateElementsInListUsingStreams(List<Integer> numbers) {
        List<Integer> duplicateElements = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(entry->entry.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("DupicateElementsInListUsingStreams :"+duplicateElements);
    }
}
