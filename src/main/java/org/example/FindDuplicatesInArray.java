package org.example;

public class FindDuplicatesInArray {

    static void main(String[] args) {


        //------------------------------------------------- How to find duplicates in array in java using brute force method
        int[] arr = {1, 2, 3, 4, 4, 1, 4, 4};
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (visited[i]) {
                    continue;
                }
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            if (count > 1) {
                System.out.println(arr[i] + " occurs " + count + " times");
            }
        }
    }
}
