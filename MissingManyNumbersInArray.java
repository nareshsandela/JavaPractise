package org.example;

import java.util.*;

public class MissingManyNumbersInArray {
    public static void main(String[] args) {
        int[] arrayInt = {1, 4, 5, 6, 7};
        System.out.println(missingNumbers(arrayInt));
    }

    public static List<Integer> missingNumbers(int[] arrayInt) {
        Arrays.sort(arrayInt);
        int max = arrayInt[arrayInt.length - 1];
        Set<Integer> presentNumbers = new HashSet<>();
        List<Integer> missingNum = new ArrayList<>();

        for (int num : arrayInt) {
            presentNumbers.add(num);
        }
        for (int i = 1; i <= max; i++) {
            if (!presentNumbers.contains(i)) {
                missingNum.add(i);
            }
        }
        return missingNum;
    }
}
