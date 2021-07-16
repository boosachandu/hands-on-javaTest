package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamReuse {
    public static void main(String[] args) {
        /*Stream<String> names = Arrays.asList("chandu", "Rama", "Kavya", "Rani").stream();
        names.forEach(n -> System.out.println(n));
        names.filter(n-> "Kavya".equals(n)).count();*/
        List<String> someList = Arrays.asList("chandu", "Rama", "Kavya", "Rani");
        Supplier<Stream<String>> sup = () -> someList.stream();
        List<String> nonEmptyStrings = sup.get().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        Set<String> uniqueStrings = sup.get().collect(Collectors.toSet());

    }
}
