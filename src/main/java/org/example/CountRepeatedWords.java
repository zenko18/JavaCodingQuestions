package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class CountRepeatedWords {
    static void main(String[] args) {
        // ------------------------------------------------- Count repeated words in sentence
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] words = line.split(" ");

        HashMap<String, Integer> hash = new HashMap<>();
        for (String word : words) {
            if (hash.containsKey(word)) {
                hash.put(word, hash.get(word) + 1);
            } else hash.put(word, 1);
        }
        System.out.println(hash);
    }
}
