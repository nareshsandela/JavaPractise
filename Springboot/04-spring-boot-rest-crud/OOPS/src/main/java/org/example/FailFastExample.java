package org.example;

import java.util.HashMap;
import java.util.Map;

public class FailFastExample {
        public static void main(String[] args) {
            Map<String, String> map = new HashMap<>();
            map.put("1", "One");
            map.put("2", "Two");

            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
                map.put("3", "Three"); // Causes ConcurrentModificationException
            }
        }
    }


