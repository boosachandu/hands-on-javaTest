package com.java8;

import java.util.stream.IntStream;
//static IntStream generate(IntSupplier s)
public class GenerateTest {
    public static void main(String[] args) {
        // using IntStream.generate() method
        // to generate 7 random Integer values
        IntStream intstream = IntStream.generate(() -> (int) (Math.random() * 10000));

        // Displaying the randomly generated values
        intstream.limit(7).forEach(System.out::println);
    }
}
