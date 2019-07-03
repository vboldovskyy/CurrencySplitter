package com.cursor.currencysplitter;

import com.cursor.currencysplitter.performance.PerformanceTest;
import com.cursor.currencysplitter.splitter.CurrencySplitter;

import java.util.Random;

 class AppLauncher {
     private static final int LOWER_BOUND = 24565;
     private static final int UPPER_BOUND = 35789;
     private static final int TEST_ITERATIONS = 5;


    private void testCurrencySplitting() {
        for (int i = 0; i < TEST_ITERATIONS; i++)
            System.out.println(new CurrencySplitter(new Random().nextInt(Integer.MAX_VALUE)).toString());
    }

    private void testPerformance() {

        new PerformanceTest().testRange(LOWER_BOUND, UPPER_BOUND);
    }

     void startApp() {
        System.out.println("Testing the correctness of currency splitting:");
        testCurrencySplitting();
        System.out.println("------------------------\nNow testing performance:");
        testPerformance();
    }
}
