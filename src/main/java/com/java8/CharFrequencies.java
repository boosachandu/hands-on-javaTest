package com.java8;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequencies {
    public static void main(String[] args) {
        String s = "abcaba";
        Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " : " + v));

    }
}
