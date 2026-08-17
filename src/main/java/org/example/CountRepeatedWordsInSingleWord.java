package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class CountRepeatedWordsInSingleWord {
    static void main(String[] args) {
        //------------------------------------------------- Count repeated words in single word
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        HashMap<Character, Integer> hash = new HashMap<>();
        // Count characters
        for (char ch : line.toCharArray()) {
            if (hash.containsKey(ch)) {
                hash.put(ch, hash.get(ch) + 1);
            } else hash.put(ch, 1);
        }
        System.out.println(hash);
    }
}
