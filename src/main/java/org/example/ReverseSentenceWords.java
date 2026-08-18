package org.example;

public class ReverseSentenceWords {
    static void main(String[] args) {

        //------------------------------------------------- How to reverse sentence words
        // example = I am the best
        //           best the am I
        //Using StringBuilder
        String str = "I m the best";
        String[] words = str.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

    }
}
