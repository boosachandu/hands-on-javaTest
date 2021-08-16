package com.interview;

import java.util.HashMap;
import java.util.Map;

public class DuplicateString {

    public static void main(String[] args) {
        String s = "Red Blue Pink Blue Pink Yellow";

        //Arrays.stream(s.split(" "))
    }

    public String getDuplicate(String[] s) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length; i++) {
            map.put(s[0], map.get(s) == null ? 1 : map.get(s) + 1);
        }

        return null;
    }

}
