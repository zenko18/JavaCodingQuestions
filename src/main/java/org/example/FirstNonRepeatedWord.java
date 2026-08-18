package org.example;

import java.util.HashMap;

public class FirstNonRepeatedWord {

    static void main(String[] args) {
        //------------------------------------------------- check if first non-repeated word
        String str = "swiss";
        HashMap<Character, Integer> hash = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (hash.containsKey(ch)) {
                hash.put(ch, hash.get(ch) + 1);
            } else hash.put(ch, 1);
        }
        for (char ch : str.toCharArray()) {
            if (hash.get(ch) == 1) {
                System.out.println("First ch " + ch);
                break;
            }
        }
    }
}
