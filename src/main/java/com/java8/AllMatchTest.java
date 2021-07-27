package com.java8;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AllMatchTest {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(3, 4, 6, 12, 20);

        // Check if all elements of stream
        // are divisible by 3 or not using
        // Stream allMatch(Predicate predicate)
        boolean answer1 = integerStream.allMatch(n -> n % 3 == 0);
        System.out.println(answer1);

        //-------------------------------

        Stream<String> stringStream = Stream.of("Geeks", "for", "GeeksQuiz", "GeeksforGeeks");

        // Check if all elements of stream
        // have length greater than 2 using
        // Stream allMatch(Predicate predicate)
        boolean answer2 = stringStream.allMatch(s -> s.length() > 2);
        System.out.println(answer2);

        //-----------------------------
        Stream<String> stringStream1 = Stream.of("Geeks", "for", "GeeksQuiz", "GeeksforGeeks");
        // Check if Character at 1st index is
        // UpperCase in all strings or not using
        // Stream allMatch(Predicate predicate)
        boolean answer3 = stringStream1.allMatch(s -> Character.isUpperCase(s.charAt(0)));
        System.out.println(answer3);


        // In case we want multiple function to be done.
        final String sample = "Om Sarve Bhavantu Sukhinah";

        // converting to Ascii
        IntStream intStream = sample.chars();

        // All match to check if all Ascii value greater then 100
        boolean answer4 = intStream.allMatch(c -> c > 100);
        System.out.println(answer4);

        // Need to initialize the stream again
        // to avoid runtime exception
        intStream = sample.chars();

        // All match to check if all Ascii value greater then 31
        answer4 = intStream.allMatch(c -> c > 30);
        System.out.println(answer4);

    }


}
