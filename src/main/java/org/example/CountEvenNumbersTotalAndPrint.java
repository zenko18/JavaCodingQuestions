package org.example;

import java.util.HashSet;

public class CountEvenNumbersTotalAndPrint {
    static void main(String[] args) {

        //------------------------------------------------- Count of even numbers total and even number print
        int[] arr = {0, 1, 3, 2, 4, 7, 6, 8, 3, 2};
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                System.out.println(arr[i] + " even");
                set.add(arr[i]);
                count++;
            }
        }
        System.out.println(set);
        System.out.println(count);
    }
}
