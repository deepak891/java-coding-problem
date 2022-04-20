package com.deepak.stringnums.P25_ComputingMiniumAndMiximum;

import java.util.function.BinaryOperator;

public class MinAndMax {
    public static void findMinAndMax(int num1, int num2) {
        System.out.println(Math.min(num1, num2));
        System.out.println(Math.max(num1, num2));

        //JDK 8
        Double.min(num1, num2);

        //functional
        BinaryOperator.maxBy(Integer::compare).apply(num1, num2);
        BinaryOperator.minBy(Integer::compare).apply(num1, num2);
    }
}
