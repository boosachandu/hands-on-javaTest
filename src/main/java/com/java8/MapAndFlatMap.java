package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {
    public static void main(String[] args) {
        //Map
        List<String> names = Arrays.asList("Chandu","Rama","Kavya", "Ranitha");

        List<Integer> lenths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(lenths);
        lenths.forEach(System.out::println);

        //FlatMap
       // List<String[]> distingueWord = names.stream().map(s->s.split("")).distinct().collect(Collectors.toList());

        List<String> distinctWord = names.stream()
                .map(s->s.split(""))
                .flatMap(Arrays::stream)
                .distinct().collect(Collectors.toList());

        System.out.println(distinctWord);

    }
}
