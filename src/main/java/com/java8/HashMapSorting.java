package com.java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class HashMapSorting {
    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Chandu2", 3);
        unsortedMap.put("Chandu1", 2);
        unsortedMap.put("Chandu5", 5);
        unsortedMap.put("Chandu6", 6);
        unsortedMap.put("Chandu8", 9);
        unsortedMap.put("Chandu7", 7);
        unsortedMap.put("Chandu9", 8);

        Map<String, Integer> sortedMap =
                unsortedMap.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
                                LinkedHashMap::new));
        System.out.println(sortedMap);

        sortedMap =
                unsortedMap.entrySet().stream()
                        .sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
                        .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
                                LinkedHashMap::new));
        System.out.println(sortedMap);

        sortedMap =
                unsortedMap.entrySet().stream()
                        .sorted(Map.Entry.comparingByKey())
                        .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(sortedMap);

        sortedMap =
                unsortedMap.entrySet().stream()
                        .sorted(Map.Entry.<String, Integer>comparingByKey().reversed())
                        .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(sortedMap);

//------------------------------------------------------------------------

        String s = "abcaba";
        Map<Character, Integer> frequencies = s.chars().boxed()
                .collect(toMap(
                        // key = char
                        k -> (char) k.intValue(),
                        v -> 1,         // 1 occurence
                        Integer::sum)); // counting
        System.out.println("Frequencies:\n" + frequencies);
    }


}
