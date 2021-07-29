package com.java8;

import java.util.LongSummaryStatistics;
import java.util.stream.LongStream;

public class LongSummaryStatisticsTest {
    public static void main(String[] args) {
        LongStream longStream = LongStream.of(1,4,6,90,80);

        LongSummaryStatistics longSummaryStatistics = longStream.summaryStatistics();
        System.out.println(longSummaryStatistics);
    }
}
