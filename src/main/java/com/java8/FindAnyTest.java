package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindAnyTest {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2, 4, 6, 8, 10);

        Optional<Integer> answer = integerList.stream().filter(num -> num == 8).findAny();
        if (answer.isPresent()) {
            System.out.println(answer.get());
        } else {
            System.out.println("no Value");
        }

//------------------------------
// Creating a List of Strings
        List<String> list = Arrays.asList("Geeks", "for", "GeeksQuiz", "GFG");

        System.out.println(list.stream().filter(s->s.charAt(0) == 'f').findAny().orElse(null));

        //  -------------------------------------------------------
        // Creating an IntStream
        IntStream intStream = IntStream.of(4, 5, 8, 10, 12, 16).parallel();

        // Using Stream findAny().
        // Executing the source code multiple times
        // may not return the same result.
        // Every time you may get a different
        // Integer which is divisible by 4.
        intStream = intStream.filter(i -> i % 4 == 0);

        OptionalInt optionalInt = intStream.findAny();
        System.out.println(optionalInt.orElse(1));
    }
}
