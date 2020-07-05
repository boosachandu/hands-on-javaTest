package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingBy {

    public static void main(String[] args) {
        List<String> items = Arrays.asList("Apple", "Mango", "Apple", "Orange", "Banana", "Apple", "Mango", "Banana");
        Map<String, Long> result = items.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);


    }
}
