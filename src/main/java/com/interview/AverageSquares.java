package com.interview;

import java.util.Arrays;
import java.util.List;

public class AverageSquares {
    public static void main(String[] args) {
        /* List of integers with that square each number and find square greater than 100's average.*/

        List<Integer> integerList = Arrays.asList(1, 6, 7, 4, 101, 120);


        integerList.stream()
                .map(n -> n * n).filter(s -> s > 100)
                .mapToInt(s -> s)
                .average().ifPresent(d -> System.out.println(d));

    }
}
