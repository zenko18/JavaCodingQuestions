package org.example;

public class FactorialNumber {
    static void main(String[] args) {
        int n = 5;
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
            System.out.print(i + "! ");
        }
        System.out.println(res);
    }
}
