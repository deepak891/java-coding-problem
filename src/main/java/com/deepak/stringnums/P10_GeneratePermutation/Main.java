package com.deepak.stringnums.P10_GeneratePermutation;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        Strings.permuteAndPrint("ABC");
        System.out.println();
        Strings.permuteAndPrintV1("ABC",0);
    }

    private static void displayExecutionTime(long time) {
        System.out.println("Execution time :: " + time + " ns " + " (" + TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms) ");
    }
}
