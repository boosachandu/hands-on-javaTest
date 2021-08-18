package com.interview;

public class LargestSumOfSubArrayOfArray {
    public static void main(String[] args) {
        int[] array = new int[]{-2, -4, -5, -1};
        System.out.println(calculateLargestSum(array));
    }

    private static int calculateLargestSum(int[] array) {
        int largestPositiveSum = 0;
        int largestNegative = 0;
        int negativeCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                largestPositiveSum = largestPositiveSum + array[i];
            } else {
                if (negativeCount == 0) {
                    largestNegative = array[i];
                    negativeCount++;
                } else if (largestNegative < array[i]) {
                    largestNegative = array[i];
                }
            }
        }

        if (largestPositiveSum != 0) {
            return largestPositiveSum;
        }
        if (largestPositiveSum == 0 && largestNegative != 0) {
            return largestNegative;
        }

        return 0;
    }
}
