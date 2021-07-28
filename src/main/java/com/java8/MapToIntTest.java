package com.java8;

import java.util.Arrays;
import java.util.List;

public class MapToIntTest {
    public static void main(String[] args) {
        // Creating a list of Strings
        List<String> list = Arrays.asList("3", "6", "8", "14", "15");
        list.stream()
                .mapToInt(num -> Integer.parseInt(num))
                .filter(num -> num % 3 == 0)
                .forEach(System.out::println);

        // Creating a list of Strings
        list = Arrays.asList("Geeks", "for", "gfg",
                "GeeksforGeeks", "GeeksQuiz");

        list.stream().mapToInt(s-> s.length()).forEach(System.out::println);

    }
}
