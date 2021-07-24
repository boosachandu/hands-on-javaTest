package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateIntegers {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,12,67,6,3,3);

        List<Integer> uniqueIntegerList= integerList.stream().distinct().collect(Collectors.toList());
        uniqueIntegerList.forEach(System.out::println);

        Function2 function2 = (T, U) -> new Function2Execute.System();
        System.out.println(function2);
    }
}
