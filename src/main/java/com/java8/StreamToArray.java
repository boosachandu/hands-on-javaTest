package com.java8;

import java.util.Arrays;
import java.util.stream.Stream;

//Object[] toArray()
public class StreamToArray {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(4, 5, 7,9);

        Object[] arr = integerStream.toArray();

        System.out.println(Arrays.toString(arr));


    }
}
