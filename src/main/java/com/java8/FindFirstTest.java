package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstTest {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6, 89, 90, 8, 0);
        Optional<Integer> optionalInteger = integerList.stream().findAny();

        System.out.println(optionalInteger.orElse(null));

        // Creating a List of Strings
        List<String> list = Arrays.asList("GeeksforGeeks", "for", "GeeksQuiz", "GFG");

        Optional<String> stringOptional = list.stream().findAny();

        System.out.println(stringOptional.orElse(null));

        System.out.println(stringOptional.get());
    }
}
