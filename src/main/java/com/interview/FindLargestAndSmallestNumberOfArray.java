package com.interview;

public class FindLargestAndSmallestNumberOfArray {
    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 6, 1, 9, 56};

        System.out.println(findLargestNumber(array));
        System.out.println(findSmallestNumber(array));
    }

    private static int findLargestNumber(int[] array) {
        int i;
        int max = array[0];
        for (i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    private static int findSmallestNumber(int[] array) {
        int i;
        int min = array[0];
        for (i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
