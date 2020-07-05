package com.programms;

public class MaxNumber {

    public static void main(String[] args) {
        int[] inputArray = new int[]{4, 9, 55, 220, 67, 94, 100};

        int max = inputArray[0];
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i + 1] > max) {
                max = inputArray[i + 1];
            }
        }

        System.out.println("Max value: " + max);
    }
}
