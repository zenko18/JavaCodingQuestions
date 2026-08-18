package org.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class FindDuplicatesStringInArrayUsingHashSet {
    static void main(String[] args) {


        String str = "java is easy java is simple";
        String[] words = str.split(" ");
        HashSet<String> set = new LinkedHashSet<>();
        for (String word : words) {
            set.add(word);
        }
        // System.out.println(set);
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            String next = itr.next().toString();
            System.out.println(next);

        }

    }
}
