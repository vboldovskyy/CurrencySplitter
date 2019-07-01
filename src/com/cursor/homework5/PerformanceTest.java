package com.cursor.homework5;

public class PerformanceTest {


    public void testOnce(int value) {
        long timeBefore = System.nanoTime();
        new CurrencySplitter(value);
        long timeAfter = System.nanoTime();
        System.out.println("Splitting " + value + " UAH took " + (timeAfter - timeBefore) + " nanoseconds.");
    }


     void testRange(int from, int to) {
        long minTime = Long.MAX_VALUE;
        int minValue = Integer.MAX_VALUE;
        long maxTime = -1L;
        int maxValue = -1;
        long averageTime;
        long counter = 0;
        for (int i = from; i <= to; i++) {
            long timeBefore = System.nanoTime();
            new CurrencySplitter(i);
            long timeAfter = System.nanoTime();
            long difference = timeAfter - timeBefore;
            if (difference < minTime) {
                minTime = difference;
                minValue = i;
            }
            if (difference > maxTime) {
                maxTime = difference;
                maxValue = i;
            }
            counter += difference;
        }
        averageTime = counter / (to - from + 1);
        System.out.println("Split a range of values from " + from + " to " + to + " UAH");
        System.out.println("It took overall " + counter + " nanoseconds");
        System.out.println("The best time is " + minTime + " nanoseconds for " + minValue + " UAH");
        System.out.println("The worst time is " + maxTime + " nanoseconds for " + maxValue + " UAH");
        System.out.println("The average time is " + averageTime + " nanoseconds");


    }
}
