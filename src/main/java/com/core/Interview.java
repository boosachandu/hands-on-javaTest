package com.core;

import java.util.ArrayList;
import java.util.List;

public class Interview {
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println(s);
        s.concat("xyz");
        System.out.println(s);
        s = s.concat("xyz");
        System.out.println(s);
        s=s+"xyz";
        System.out.println(s);

        String s1 = new String("abcd");
        System.out.println(s1);
        s1.concat("xyz");
        System.out.println(s1);
        s1 = s1.concat("xyz");
        System.out.println(s1);
        s1=s1+"xyz";
        System.out.println(s1);

        String s3 = "abcd";
        String s4 = "xyz";
        s3 = s3+s4;
        System.out.println(s3);

        int x=14;
        int y=x-- - --x;

        System.out.println("y = "+y);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(2);
        integerList.add(6);

        System.out.println("integerList"+integerList);

        integerList.remove(2);
        System.out.println(integerList);

        Interview test = null;
        test.abc();
    }
     private static void abc(){
         System.out.println("inside abc() method");
     }
}
