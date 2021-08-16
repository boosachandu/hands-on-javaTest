package com.interview;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("SB");
        StringBuilder s1 = sb.append("SB2");
        System.out.println("SB: "+ sb);
        System.out.println("SB1: "+ s1);

    }
}
