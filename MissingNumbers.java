package org.example;

import java.util.*;

public class MissingNumbers {
    public static List<Integer> findMissingNumbers(int[] nums) {
        Arrays.sort(nums); // Sort the array first
        int n = nums[nums.length - 1]; // Get the max element (last element after sorting)

        Set<Integer> set = new HashSet<>();
        List<Integer> missingNumbers = new ArrayList<>();

        for (int num : nums) {
            set.add(num); // Store present numbers in HashSet
        }

        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) { // Check for missing numbers
                missingNumbers.add(i);
            }
        }

        return missingNumbers;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 6}; // Unsorted input
        System.out.println("Missing Numbers: " + findMissingNumbers(arr)); // Output: [3, 5]
    }
}
