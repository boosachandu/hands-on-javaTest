package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NonMatchTest {
    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("CSE", "C++", "Jav", "DS");
        boolean answer = stringStream.noneMatch(str -> str.length() == 4);
        System.out.println(answer);

        List<Integer> integerList = Arrays.asList(4, 0, 6, 2);
        boolean answer2 = integerList.stream().noneMatch(n -> n < 0);
        System.out.println(answer2);

        Stream<String> stream = Stream.of("Geeks", "fOr", "GEEKSQUIZ", "GeeksforGeeks", "CSe");

        boolean answer3 = stream.noneMatch(
                str->Character.isUpperCase(str.charAt(1))
                && Character.isLowerCase(str.charAt(2))
                && str.charAt(0) == 'f'
        );

        System.out.println(answer3);
    }
}
