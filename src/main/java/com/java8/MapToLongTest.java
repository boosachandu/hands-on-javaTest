package com.java8;

import java.util.Arrays;
import java.util.List;

// Java code for Stream mapToLong
// (ToLongFunction mapper) to get a
// LongStream by applying the given function
// to the elements of this stream.
public class MapToLongTest {
    public static void main(String[] args) {
        System.out.println("The stream after applying "
                + "the function is : ");

        List<String> list = Arrays.asList("25", "225", "1000", "20", "15");

        // Using Stream mapToLong(ToLongFunction mapper)
        // and displaying the corresponding LongStream
        list.stream()
                .mapToLong(num -> Long.parseLong(num))
                .filter(num -> Math.sqrt(num) / 5 == 3)
                .forEach(System.out::println);

       // ---------------------------------------------------------------

       // mapToLong() function with returning number of set-bits in string length.
        List<String> strings = Arrays.asList("Data Structures", "JAVA", "OOPS", "GeeksforGeeks", "Algorithms");

        // Using Stream mapToLong(ToLongFunction mapper)
        // and displaying the corresponding LongStream
        // which contains the number of one-bits in
        // binary representation of String length
        strings.stream()
                .mapToLong(str ->Long.bitCount(str.length()))
                .forEach(System.out::println);
    }
}
