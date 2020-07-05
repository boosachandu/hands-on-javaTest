package com.programms;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] inputArray = new int[]{8, 5, 4, 90, 34, 54, 1, 95};
        int[] sortedArray = new int[8];
        int count = inputArray.length;
        int temp;
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (inputArray[i] > inputArray[j]) {
                    temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array: " + inputArray);
        for (int num :
                inputArray) {
            System.out.print(num + "  ");

        }
        System.out.println();
        //Using Array.sort()
        int[] arr = new int[]{5, 2, 8, 7, 1};
        Arrays.sort(arr);
        for (int num :
                arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        int[] arr1 = new int[]{5, 2, 8, 7, 1};

        arr1 = Arrays.stream(arr1).sorted().toArray();
        for (int num :
                arr1) {
            System.out.print(num + " ");
        }
    }
}
