package com.tw.academy.basic.$2_magic_number;

public class FareCalculation {

    public static final int MIDDLE_BOUNDARY_OF_DISCOUNT = 150;
    public static final int MIN_BOUNDARY_OF_8_DISCOUNT = 100;
    public static final int MAX_BOUNDARY_OF_5_DISCOUNT = 400;

    public double calculate(double originalPrice, double cumulativeExpensesThisMonth) {
        if (cumulativeExpensesThisMonth >= MIN_BOUNDARY_OF_8_DISCOUNT && cumulativeExpensesThisMonth < MIDDLE_BOUNDARY_OF_DISCOUNT) {
            return originalPrice * 0.8;
        }
        if (cumulativeExpensesThisMonth >= MIDDLE_BOUNDARY_OF_DISCOUNT && cumulativeExpensesThisMonth < MAX_BOUNDARY_OF_5_DISCOUNT) {
            return originalPrice * 0.5;
        }
        return originalPrice;
    }
}
