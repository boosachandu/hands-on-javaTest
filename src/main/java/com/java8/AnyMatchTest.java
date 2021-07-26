package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AnyMatchTest {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(3, 4, 6, 12, 20);
        boolean answer = integerList.stream().anyMatch(n -> n * (n + 1) / 4 == 5);
        System.out.println(answer);


        // using string stream

        Stream<String> stringStream = Stream.of("Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks");
        boolean answer2 = stringStream.anyMatch(str -> Character.isUpperCase(str.charAt(1)));

        System.out.println(answer2);
    }
}
