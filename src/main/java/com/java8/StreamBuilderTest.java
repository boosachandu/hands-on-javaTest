package com.java8;

import java.util.stream.Stream;

//static <T> Stream.Builder<T> builder()
public class StreamBuilderTest {
    public static void main(String[] args) {

        Stream.Builder<String> builder = Stream.builder();

        Stream<String> stream = builder.add("Geeks").build();

        stream.forEach(System.out::println);
    }
}
