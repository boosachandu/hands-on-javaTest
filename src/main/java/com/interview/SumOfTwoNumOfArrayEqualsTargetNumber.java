package com.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Persistance
public class SumOfTwoNumOfArrayEqualsTargetNumber {
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 5, 7, 2};
        Arrays.stream(displayTargetSumValues(array, 10)).forEach(System.out::println);
        Arrays.stream(getArrayValues(array, 10)).forEach(System.out::println);
    }

    //Complexity O(n^2)--- because of two for loops
    private static int[] displayTargetSumValues(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (target == array[i] + array[j]) {
                    return new int[]{array[i], array[j]};
                }
            }
        }
        return new int[]{};
    }

    //Complexity O(n)--- Most Efficient way
    private static int[] getArrayValues(int[] array, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int complaint = target - array[i];
            if (numMap.containsKey(complaint)) {
                return new int[]{complaint, array[i]};
            } else {
                numMap.put(array[i], i);
            }
        }

        return new int[]{};
    }
}
