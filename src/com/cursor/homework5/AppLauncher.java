package com.cursor.homework5;

import com.cursor.homework5.performance.PerformanceTest;
import com.cursor.homework5.splitter.CurrencySplitter;

import java.util.Random;

 class AppLauncher {


    private void testCurrencySplitting() {
        for (int i = 0; i < 6; i++)
            System.out.println(new CurrencySplitter(new Random().nextInt(10000)).toString());
    }

    private void testPerformance() {

        new PerformanceTest().testRange(24565, 35789);
    }

     void startApp() {
        System.out.println("Testing the correctness of currency splitting:");
        testCurrencySplitting();
        System.out.println("------------------------\nNow testing performance:");
        testPerformance();
    }
}
