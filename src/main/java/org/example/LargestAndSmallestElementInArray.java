package org.example;

public class LargestAndSmallestElementInArray {
    static void main(String[] args) {

        //------------------------------------------------- How to find largest and smallest element in array
        int[] arr = {5, 11, 8, 1, 10};
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            } else largest = largest;
            if (arr[i] < smallest) {
                smallest = arr[i];
            } else smallest = smallest;
        }
        System.out.println("largest : " + largest);
        System.out.println("smallest : " + smallest);//   }
    }
}
