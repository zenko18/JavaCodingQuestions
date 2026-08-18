package org.example;

public class ReverseString {
    static void main(String[] args) {

        //------------------------------------------------- Reverse string
        //First Method by StringBuffer
        String str = "Java";
        StringBuffer string = new StringBuffer(str);
        String word = string.reverse().toString();
        System.out.println(word);
        //Second Method by for loop
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
    }
}
