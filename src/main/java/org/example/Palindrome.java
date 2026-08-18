package org.example;

public class Palindrome {
    static void main(String[] args) {

        //------------------------------------------------- check PALINDROME string using recursion

        String str = "level";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if (str.equals(reverse)) {
            System.out.println(reverse + " a palindrome.");
        } else System.out.println("Not a palindrome.");

        //Using StringBuilder
        StringBuilder sc = new StringBuilder(str);
        String reverse2 = sc.reverse().toString();
        if (str.equals(reverse2)) {
            System.out.println(reverse2 + " a palindrome");
        } else System.out.println(reverse2 + " not a palindrome");

    }
}
