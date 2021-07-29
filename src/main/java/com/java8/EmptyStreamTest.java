package com.java8;

import java.util.stream.Stream;

//static <T> Stream<T> empty()
public class EmptyStreamTest {
    public static void main(String[] args) {
        Stream<String> stream = Stream.empty();

        stream.forEach(System.out::println);
    }
}
