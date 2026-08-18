package org.example;

import java.util.HashMap;

public class FindDuplicatesInArrayUsingHashMap {
    static void main(String[] args) {

        //------------------------------------------------- How to find duplicates in array in java using hash map
        int[] arr = {1, 2, 3, 2, 4, 3, 2};
        HashMap<Integer, Integer> map = new HashMap<>();
        // Count every number
        for (int num : arr)
        {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        // Print only duplicates
        for (int num : map.keySet())
        {
            if (map.get(num) > 1) {
                System.out.println(num + " occurs " + map.get(num) + " times");
            }
        }
    }
}
