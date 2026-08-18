package org.example;

public class PrintCharacterAtOddPlaces {
    static void main(String[] args) {

        //-------------------------------------------------Print character at odd places
        String arr = "How are you";
        // int count = 0;
        char[] ch = arr.toCharArray();
        System.out.println(ch);
        for (int i = 0; i < ch.length; i++) {

            if (i % 2 != 0 && i != 0) {
                if (ch[i] == ' ') {
                    System.out.print("_");
                }
                System.out.print(ch[i]);
            }
        }
    }
}
