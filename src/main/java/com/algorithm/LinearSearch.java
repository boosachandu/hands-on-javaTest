package com.algorithm;

public class LinearSearch {
    //Linear search complexity is O(n)
    public static void main(String[] args) {
        int[] integers = {4, 8, 90, 54, 2, 9};
        int number = 54;
        int index = findNumberIndex(integers, number);
        if (index == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at "
                    + "index " + index);
        }
    }

    private static int findNumberIndex(int[] integersArray, int number) {
        for (int i = 0; i < integersArray.length; i++) {
            if (integersArray[i] == number) {
                return i;
            }
        }
        return -1;
    }
}
