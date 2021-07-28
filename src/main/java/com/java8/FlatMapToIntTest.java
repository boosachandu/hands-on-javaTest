package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMapToIntTest {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");

        // Using Stream flatMapToInt(Function mapper)
        strings.stream().flatMapToInt(num -> IntStream.of(Integer.parseInt(num))).forEach(System.out::println);
        System.out.println();

        //----------------------------
        List<String> list = Arrays.asList("Geeks", "GFG",
                "GeeksforGeeks", "gfg");
        list.stream().flatMapToInt(s -> IntStream.of(s.length())).forEach(System.out::println);
        System.out.println();

        list.stream().map(s-> s.length()).forEach(System.out::println);

    }
}
