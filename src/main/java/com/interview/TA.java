package com.interview;

public class TA {
    public static void main(String[] args) {

        int[] array = new int[]{2, 3, 5, 8, 10};
        twoSum(array, 8);
    }

    public static void twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(nums[i] + " : " + nums[j]);
                }
            }
        }
    }
}
