package org.example;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.*;

public class swapNumber {

    public static void main(String[] args) throws IOException {

//      //------------------------------------------------- SwapNumber
//        int a = 10, b = 20;
//        System.out.println(a + " and " + b);
//        int temp;
//        temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a + " and " + b);






        //------------------------------------------------- Count character Occurrence in a given String

//        String line = "a apple is apple";
//        int count = line.length() - line.replaceAll("p", "").length();
//        System.out.println(count);


        //------------------------------------------------- check if two strings are ANAGRAM
//        String str1 = "Mary";
//        String srt2 = "Army";
//
//        char[] ch1 = str1.toLowerCase().toCharArray(); // m a r y
//        char[] ch2 = srt2.toLowerCase().toCharArray(); // a r m y
//
//        Arrays.sort(ch1); //a m r y
//        Arrays.sort(ch2); //a m r y
//
//        if (Arrays.equals(ch1, ch2)) {
//            System.out.println("Given Strings are ANAGRAM");
//        } else System.out.println("Given Strings are NOT ANAGRAM");

        //------------------------------------------------- check if first non-repeated word
//        String str = "swiss";
//        HashMap<Character, Integer> hash = new HashMap<>();
//
//        for (char ch : str.toCharArray()) {
//            if (hash.containsKey(ch)) {
//                hash.put(ch, hash.get(ch) + 1);
//            } else hash.put(ch, 1);
//        }
//        for (char ch : str.toCharArray()) {
//            if (hash.get(ch) == 1) {
//                System.out.println("First ch " + ch);
//                break;
//            }
//        }

        //------------------------------------------------- Reverse string
        //First Method by StringBuffer
//        String str = "Java";
//        StringBuffer string = new StringBuffer(str);
//        String word = string.reverse().toString();
//        System.out.println(word);
//        //Second Method by for loop
//        String reverse = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reverse = reverse + str.charAt(i);
//        }
//        System.out.println(reverse);

        //------------------------------------------------- Extract last four and first four character from string
//        String str = "Honey.com";
//
//        //Using SubString
//        String MethodFirstChar = str.substring(0, 4);
//        System.out.println(MethodFirstChar);
//
//        String MethodLastChar = str.substring(str.length() - 4, str.length());
//        System.out.println(MethodLastChar);
//
//        String MiddleChar = str.substring(2, str.length() - 3);
//        System.out.println(MiddleChar);
//
//        //Using For loop
//        String LastChar = "";
//        String FirstChar = "";
//        for (int i = str.length() - 1; i >= str.length() - 4; i--) {
//            LastChar = str.charAt(i) + LastChar;
//        }
//        System.out.println(LastChar);
//        for (int i = 0; i < str.length() - 4 - 1; i++) {
//            FirstChar = FirstChar + str.charAt(i);
//        }
//        System.out.println(FirstChar);


        //------------------------------------------------- check PALINDROME string using recursion

//        String str = "level";
//        String reverse = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reverse = reverse + str.charAt(i);
//        }
//        if (str.equals(reverse)) {
//            System.out.println(reverse + " a palindrome.");
//        } else System.out.println("Not a palindrome.");
//
//        //Using StringBuilder
//        StringBuilder sc = new StringBuilder(str);
//        String reverse2 = sc.reverse().toString();
//        if (str.equals(reverse2)) {
//            System.out.println(reverse2 + " a palindrome");
//        } else System.out.println(reverse2 + " not a palindrome");


        //------------------------------------------------- How to reverse sentence words
        // example = I am the best
        //           best the am I
        //Using StringBuilder
//        String str = "I m the best";
//        String[] words = str.split(" ");
//        for (int i = words.length - 1; i >= 0; i--) {
//            System.out.print(words[i] + " ");
//        }

        //------------------------------------------------- How to reverse each [every] word in sentence
//        String str = "How are you"; // output needs - woh era ouy
//        String[] words = str.split(" ");
//        for (String word : words) {
//            String reverse = "";
//            for (int i = word.length() - 1; i >= 0; i--) {
//                reverse = reverse + word.charAt(i);
//            }
//            //   reverse += " " ;
//            System.out.print(reverse.toLowerCase() + " ");
//        }

        //------------------------------------------------- How to find largest and smallest element in array
//        int[] arr = {5, 11, 8, 1, 10};
//        int largest = arr[0];
//        int smallest = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > largest) {
//                largest = arr[i];
//            } else largest = largest;
//            if (arr[i] < smallest) {
//                smallest = arr[i];
//            } else smallest = smallest;
//        }
//        System.out.println("largest : " + largest);
//        System.out.println("smallest : " + smallest);//   }

        //------------------------------------------------- Find Missing Number In Array
//        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10};
//        int sum = 0, expected = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//        }
//        System.out.println(sum);
//        for (int i = 1; i <= 10; i++) {
//            expected = expected + i;
//        }
//        System.out.println(expected);
//        System.out.println("Missing Number In Array : " + (expected - sum ));

        //------------------------------------------------- How to find duplicates in array in java using brute force method
//        int[] arr = {1, 2, 3, 4, 4, 1, 4, 4};
//        boolean[] visited = new boolean[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            int count = 1;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (visited[i]) {
//                    continue;
//                }
//                if (arr[i] == arr[j]) {
//                    count++;
//                    visited[j] = true;
//                }
//            }
//            if (count > 1) {
//                System.out.println(arr[i] + " occurs " + count + " times");
//            }
//        }

        //------------------------------------------------- How to find duplicates in array in java using hash map
//        int[] arr = {1, 2, 3, 2, 4, 3, 2};
//        HashMap<Integer, Integer> map = new HashMap<>();
//        // Count every number
//        for (int num : arr)
//        {
//            if (map.containsKey(num)) {
//                map.put(num, map.get(num) + 1);
//            } else {
//                map.put(num, 1);
//            }
//        }
//        // Print only duplicates
//        for (int num : map.keySet())
//        {
//            if (map.get(num) > 1) {
//                System.out.println(num + " occurs " + map.get(num) + " times");
//            }
//        }

        //------------------------------------------------- Count of even numbers total and even number print
//        int[] arr = {0, 1, 3, 2, 4, 7, 6, 8, 3, 2};
//        int count = 0;
//        HashSet<Integer> set = new HashSet<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0 && arr[i] != 0) {
//                System.out.println(arr[i] + " even");
//                set.add(arr[i]);
//                count++;
//            }
//        }
//        System.out.println(set);
//        System.out.println(count);

        //-------------------------------------------------Print character at odd places
//        String arr = "How are you";
//        // int count = 0;
//        char[] ch = arr.toCharArray();
//        System.out.println(ch);
//        for (int i = 0; i < ch.length; i++) {
//
//            if (i % 2 != 0 && i != 0) {
//                if (ch[i] == ' ') {
//                    System.out.print("_");
//                }
//                System.out.print(ch[i]);
//            }
//        }

        //-------------------------------------------------Print character at odd places
//        String str = "java is easy java is simple";
//        String[] words = str.split(" ");
//        HashSet<String> set = new LinkedHashSet<>();
//        for (String word : words) {
//            set.add(word);
//        }
//        // System.out.println(set);
//        Iterator itr = set.iterator();
//        while (itr.hasNext()) {
//            String next = itr.next().toString();
//            System.out.println(next);
//
//        }








    }
}