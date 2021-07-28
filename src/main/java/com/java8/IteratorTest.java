package com.java8;

import java.util.PrimitiveIterator;
import java.util.stream.IntStream;

public class IteratorTest {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(2, 6, 8, 0);

        // Using IntStream iterator() to return
        // an iterator for elements of the stream
        PrimitiveIterator.OfInt answer = intStream.iterator();

        while (answer.hasNext()) {
            System.out.println(answer.nextInt());
        }

        IntStream stream = IntStream.range(2, 8);
        answer = stream.iterator();

        while (answer.hasNext()) {
            System.out.println(answer.nextInt());
        }
    }
}
