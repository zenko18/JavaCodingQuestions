package org.example;

public class ExtractLastAndFirstFourCharacter {
    static void main(String[] args) {
        //------------------------------------------------- Extract last four and first four character from string
        String str = "Honey.com";

        //Using SubString
        String MethodFirstChar = str.substring(0, 4);
        System.out.println(MethodFirstChar);

        String MethodLastChar = str.substring(str.length() - 4, str.length());
        System.out.println(MethodLastChar);

        String MiddleChar = str.substring(2, str.length() - 3);
        System.out.println(MiddleChar);

        //Using For loop
        String LastChar = "";
        String FirstChar = "";
        for (int i = str.length() - 1; i >= str.length() - 4; i--) {
            LastChar = str.charAt(i) + LastChar;
        }
        System.out.println(LastChar);
        for (int i = 0; i < str.length() - 4 - 1; i++) {
            FirstChar = FirstChar + str.charAt(i);
        }
        System.out.println(FirstChar);
    }
}
