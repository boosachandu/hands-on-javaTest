package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDublicateElementsArrayList {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("chandu", "chandu", "Rama","Kavya", "Kavya");

       Map<String, Long > map = strings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       map.forEach((k,v)-> System.out.println(k+" : "+v));

       String s = "Apple Apple Banana Banana Guava";
       List<String> list = Arrays.asList(s.split(" "));
        list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((k, v)-> System.out.println(k+" : "+v));
    }
}
