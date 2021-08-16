package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ByLastName {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Chennaiah Boosa", "Chandu karaktla", "Kavaya Andhe");

        names.stream().filter(s -> s.contains("Boosa")).collect(Collectors.toList());

        int[] inArray = new int[]{1, 7, 0};
        int min = Arrays.stream(inArray).min().getAsInt();
        int max = Arrays.stream(inArray).max().getAsInt();

    }
    //1,7,0
}
