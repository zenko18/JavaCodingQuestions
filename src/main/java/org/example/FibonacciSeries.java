package org.example;

public class FibonacciSeries {
    static void main(String[] args) {
        int n = 10;  // 0 1 1 2 3 5 8 13 21 34
        int first = 0;
        int second = 1;
        System.out.print(first + " " + second + " ");
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
