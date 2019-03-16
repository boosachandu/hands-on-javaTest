package com.algorithm;

import lombok.ToString;

import java.util.logging.Logger;

@ToString
public class SortArray {
    private static Logger logger = Logger.getLogger(SortArray.class.getName());
    private static int[] intArray = {5, 2, 4, 6, 1, 3};
    public static void main(String[] args){
        int key;
        int i;
        for (int j = 1; j < intArray.length; j++) {
             key = intArray[j];
             i = j-1;
             /*for(i = j-1; i > -1 && intArray[i] > key; i = i ){
                 intArray[i + 1 ] = intArray[i];
                 i = i - 1;
                 intArray[i + 1] = key;
             }*/

           while ((i > -1) && (intArray[i] > key)){
                 intArray[i + 1 ] = intArray[i];
                     i = i - 1;
                 intArray[i + 1] = key;
             }
        }
        for (int element: intArray) {
            logger.info("element: "+element);
        }
    }
}
