/*
package com.java11;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringBlank {
    public static void main(String[] args) {

         */
/*isBlank(): This is a boolean method.
        It just returns true when a string is empty and vice-versa.*//*


        String s1 = "";
        System.out.println(s1.isBlank());

        String s2 = "chandu boosa";
        System.out.println(s2.isBlank());

       */
/* lines(): This method is to return
                a collection of strings which are divided by line terminators.*//*


        String str = "Geeks\nFor\nGeeks";
        List<String> stringList = str.lines().collect(Collectors.toList());
        System.out.println(stringList);

        */
/*repeat(n): Result is the concatenated string of original string repeated the number of times in the argument.*//*

        String s3 = "chanduboosa";

        System.out.println(s3.repeat(5));

        */
/*stripLeading(): It is used to remove the white-space which is in-front of the string*//*


        String s4 = " chandu boosa";
        System.out.println(s4.stripLeading());

        */
/*stripTrailing(): It is used to remove the white-space which is in back of the string*//*


        String s5 = "chandu boosa ";
        System.out.println(s5.stripTrailing());

        */
/*strip(): It is used to remove the white-spaces which are in-front and back of the string*//*


        String s6 = " chandu boosa ";
        System.out.println(s6.strip());

       */
/* Local-Variable Syntax for Lambda Parameters: JDK 11 allows ‘var’ to be used in lambda expressions.
        This was introduced to be consistent with local ‘var’ syntax of Java 10*//*

        IntStream.of(1, 2, 3, 4, 5, 6)
                .filter((var a) -> a % 2 == 0)
                .forEach(System.out::println);
    }

}
*/
