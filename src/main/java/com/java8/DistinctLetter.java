package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctLetter {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        List<String> distinctList = words.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctList);

        List<Integer> wordLengths =
                words.stream()
                        .map(String::length)
                        .collect(Collectors.toList());
        wordLengths.forEach(System.out::println);
    }
}
