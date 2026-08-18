package org.example;

public class CountCharacterOccurrence {
    static void main(String[] args) {

        //------------------------------------------------- Count character Occurrence in a given String

        String line = "a apple is apple";
        int count = line.length() - line.replaceAll("p", "").length();
        System.out.println(count);

    }
}
