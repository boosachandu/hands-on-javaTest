package com.java8;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

//IntSummaryStatistics summaryStatistics()
public class IntSummaryStatisticsTest {
    public static void main(String[] args) {

        IntStream intStream = IntStream.of(4, 5, 6, 7);

        // Using IntStream summaryStatistics()
        IntSummaryStatistics intSummaryStatistics = intStream.summaryStatistics();

        // Displaying the various summary data
        // about the elements of the stream
        System.out.println(intSummaryStatistics);

    }
}
