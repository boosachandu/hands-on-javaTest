package com.java8;

import java.util.stream.IntStream;

//IntStream skip(long n)
public class SkipTest {
    public static void main(String[] args) {

        IntStream intStream = IntStream.range(5, 12);

        // Using skip() to skip first 4 values in range
        // and displaying the rest of elements
        intStream.skip(4).forEach(System.out::println);

        intStream = IntStream.range(5, 12);
        intStream.parallel().skip(4).forEach(System.out::println);
    }
}
