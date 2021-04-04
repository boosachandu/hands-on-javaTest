package com.algorithm;


public class BinarySearch {

    public static void main(String[] args) {
        //Binary Search algorithm complexity is O(Log n)
        int[] sortedArray = {5, 9, 12, 23, 56, 67, 89, 99, 100, 109, 209};
        int number = 999;
        int index = findNumber(sortedArray, number);

        if (index == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at "
                    + "index " + index);
        }
    }

    private static int findNumber(int[] sortedArray, int number) {
        int l = 0;
        int r = sortedArray.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;
            // Check if x is present at mid
            if (sortedArray[m] == number) {
                return m;
            }
            // If x greater, ignore left half
            if (sortedArray[m] <= number) {
                l = m + 1;
            } else { // If x is smaller, ignore right half
                r = m - 1;
            }
        }

        return -1;
    }
}

