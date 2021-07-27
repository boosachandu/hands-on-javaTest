package com.java8;

import java.util.stream.Stream;

public class ForEachOrderedTest {
    public static void main(String[] args) {

        //Creating a Stream of Strings
        Stream<String> stringStream = Stream.of("GFG", "Geeks", "for", "GeeksforGeeks");

        stringStream
                .flatMap(s -> Stream.of(s.charAt(2)))
                .forEachOrdered(System.out::println);
    }
}
