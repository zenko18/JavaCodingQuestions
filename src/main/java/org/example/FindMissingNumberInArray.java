package org.example;

public class FindMissingNumberInArray {
    static void main(String[] args) {

        //------------------------------------------------- Find Missing Number In Array
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        int sum = 0, expected = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
        for (int i = 1; i <= 10; i++) {
            expected = expected + i;
        }
        System.out.println(expected);
        System.out.println("Missing Number In Array : " + (expected - sum ));
    }
}
