package org.example;

public class ReverseEachEveryWordInSentence {
    static void main(String[] args) {


        //------------------------------------------------- How to reverse each [every] word in sentence
        String str = "How are you";
        // output needs - woh era ouy
        String[] words = str.split(" ");
        for (String word : words) {
            String reverse = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse = reverse + word.charAt(i);
            }
            //   reverse += " " ;
            System.out.print(reverse.toLowerCase() + " ");
        }
    }
}
