package com.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingTest {
    public static void main(String[] args) {
        // creating stream of integers
        Stream<Integer> i = Stream.of(1, 2, 3, 4, 5, 6);

        // counting number of integer in stream
        long count = i.collect(Collectors.counting());
        System.out.println(count);
    }
}
