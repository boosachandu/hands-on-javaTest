package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EliminateDuplicate {
    public static void main(String[] args) {

        List<Integer> duplicateElementsList = Arrays.asList(2, 3, 4,3,5,2,6,6);
        System.out.println(duplicateElementsList);

        List<Integer> uniqueElementsList = duplicateElementsList.stream().distinct().collect(Collectors.toList());

        System.out.println(uniqueElementsList);
    }
}
