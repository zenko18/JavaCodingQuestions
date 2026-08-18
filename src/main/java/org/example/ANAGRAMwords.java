package org.example;

import java.util.Arrays;

public class ANAGRAMwords {
    static void main(String[] args) {

        //------------------------------------------------- check if two strings are ANAGRAM
        String str1 = "Mary";
        String srt2 = "Army";

        char[] ch1 = str1.toLowerCase().toCharArray(); // m a r y
        char[] ch2 = srt2.toLowerCase().toCharArray(); // a r m y

        Arrays.sort(ch1); //a m r y
        Arrays.sort(ch2); //a m r y

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("Given Strings are ANAGRAM");
        } else System.out.println("Given Strings are NOT ANAGRAM");
    }
}
