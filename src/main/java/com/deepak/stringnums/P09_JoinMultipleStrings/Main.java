package com.deepak.stringnums.P09_JoinMultipleStrings;

import java.util.concurrent.TimeUnit;

public class Main {


    private static final String TEXT_1 = "Illinois";
    private static final String TEXT_2 = "Mathematics";
    private static final String TEXT_3 = "and";
    private static final String TEXT_4 = "Science";
    private static final String TEXT_5 = "Academy";

    public static void main(String[] args) {
        System.out.println("");
        long startTimeV1 = System.nanoTime();
        final String result = Strings.joinByDelimiterV1(' ', TEXT_1, TEXT_2, TEXT_3, TEXT_4, TEXT_5);
        displayExecutionTime(System.nanoTime() - startTimeV1);
        System.out.println(" Result :: " + result);

        System.out.println("Using Java 8");
        long startTimeV2 = System.nanoTime();
        final String result2 = Strings.joinByDelimiterV2(' ', TEXT_1, TEXT_2, TEXT_3, TEXT_4, TEXT_5);
        displayExecutionTime(System.nanoTime() - startTimeV2);
        System.out.println(" Result :: " + result2);

    }

    private static void displayExecutionTime(long time) {
        System.out.println("Execution time :: " + time + " ns " + " (" + TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms) ");
    }
}
