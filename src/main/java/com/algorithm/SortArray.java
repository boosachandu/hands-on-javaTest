package com.algorithm;

import lombok.ToString;

import java.util.logging.Logger;

@ToString
public class SortArray {
    private static Logger logger = Logger.getLogger(SortArray.class.getName());
    private static final int[] intAscendingArray = {5, 2, 4, 6, 1, 3};
    private static final int[] intDescendingArray = {31, 41, 59, 26, 41, 58};

    public static void main(String[] args) {
        sortArrayAscendingOrderWithWhileLoop(intAscendingArray);
        sortArrayAscendingOrderWithForLoop(intAscendingArray);
        sortArrayDescendingOrder(intDescendingArray);
        linearSearch(intAscendingArray, 8);
    }

    private static void sortArrayAscendingOrderWithWhileLoop(int[] intArray) {
        int key;
        int i;
        for (int j = 1; j < intArray.length; j++) {
            key = intArray[j];
            i = j - 1;
            while ((i > -1) && (intArray[i] > key)) {
                intArray[i + 1] = intArray[i];
                i = i - 1;
                intArray[i + 1] = key;
            }
        }
        for (int element : intArray) {
            logger.info("element: " + element);
        }
    }

    private static void sortArrayAscendingOrderWithForLoop(int[] intArray) {
        int key;
        int i;
        for (int j = 1; j < intArray.length; j++) {
            key = intArray[j];
            for (i = j - 1; i > -1 && intArray[i] > key; i--) {
                intArray[i + 1] = intArray[i];
                intArray[i] = key;
            }
        }
        for (int element : intArray) {
            logger.info("element: " + element);
        }
    }

    private static void sortArrayDescendingOrder(int[] integerArray) {
        int key;
        int i;
        for (int j = 1; j < integerArray.length; j++) {
            key = integerArray[j];
            for (i = j - 1; i > -1 && integerArray[i] < key; i--) {
                integerArray[i + 1] = integerArray[i];
                integerArray[i] = key;
            }
        }
        for (int element : integerArray) {
            logger.info("element: " + element);
        }
    }

    private static String linearSearch(int[] linearSearchArray, int matchValue) {
        String indexMatch = "Nil";
        for (int i = 0; i < linearSearchArray.length; i++) {
            if (matchValue == linearSearchArray[i]) {
                indexMatch = String.valueOf(i);
            }

        }
        logger.info(indexMatch);
        return indexMatch;
    }
}