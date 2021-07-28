package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4, 5, 7, 8, 9, 89, 78);

        System.out.println(integerList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()));
    }
}
