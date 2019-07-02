package com.cursor.homework5.splitter;

import java.util.ArrayList;
import java.util.List;

public class CurrencySplitter {

    private static final int FIVE_HUNDRED = 500;
    private static final int TWO_HUNDRED = 200;
    private static final int ONE_HUNDRED = 100;
    private static final int FIFTY = 50;
    private static final int TWENTY = 20;
    private static final int TEN = 10;
    private static final int FIVE = 5;
    private static final int TWO = 2;
    private static final int ONE = 1;
    private static final int BILLS_AMOUNT = 9;

    private static final Integer[] denominations = new Integer[]{FIVE_HUNDRED, TWO_HUNDRED, ONE_HUNDRED, FIFTY, TWENTY, TEN,
            FIVE, TWO, ONE};
    private Integer[] billCounts;
    private int cashAmount;

    public CurrencySplitter(int amount) {
        billCounts = new Integer[BILLS_AMOUNT];
        cashAmount = Math.abs(amount);
        for (int i = 0; i < BILLS_AMOUNT; i++) {
            billCounts[i] = amount / denominations[i];
            amount = amount % denominations[i];
        }
    }

    public String toString() {
        List<String> amounts = new ArrayList<>();
        for (int i = 0; i < BILLS_AMOUNT; i++) {
            if (billCounts[i] != 0) {
                amounts.add(billCounts[i]+"*"+denominations[i]);
            }
        }
        String result = String.join(" + ", amounts);
        return "The sum of " + cashAmount + " is split as follows: " + result;
    }

}
