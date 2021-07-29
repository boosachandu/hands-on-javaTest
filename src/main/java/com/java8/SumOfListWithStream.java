package com.java8;

import java.util.Arrays;
import java.util.List;

public class SumOfListWithStream {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = integerList.stream()
                .filter(i -> i > 5)
                .mapToInt(i -> i)
                .sum();
        System.out.println(sum);

        sum = integerList.stream()
                .mapToInt(i -> i)
                .sum();
        System.out.println(sum);


    }
}
