package com.deepak.stringnums.P05_CountVowelsAndConsonants;

import java.util.concurrent.TimeUnit;

public class Main {

    // 14 vowels, 19 consonants
    private static final String TEXT = " ... Illinois Mathematics & Science Academy ... ";

    public static void main(String[] args) {
        System.out.println("Input text : \n" + TEXT + "\n");

        System.out.println("Using for loop");
        long startTime1 = System.nanoTime();
        final Pair<Integer, Integer> vowelsAndConsonantV1 = Strings.countVowelsAndConsonantV1(TEXT);
        displayExecutionTime(System.nanoTime()-startTime1);
        System.out.println("vowelsAndConsonantV1 :: " + vowelsAndConsonantV1);

        System.out.println();
        System.out.println("Using partition by");
        long startTime2 = System.nanoTime();
        final Pair<Long, Long> vowelsAndConsonantV2 = Strings.countVowelsAndConsonantV2(TEXT);
        displayExecutionTime(System.nanoTime()-startTime2);
        System.out.println("vowelsAndConsonantV2 :: " + vowelsAndConsonantV2);

        System.out.println();
        System.out.println("Using different count for v & c in java 8");
        long startTime3 = System.nanoTime();
        final Pair<Long, Long> vowelsAndConsonantV3 = Strings.countVowelsAndConsonantV3(TEXT);
        displayExecutionTime(System.nanoTime()-startTime3);
        System.out.println("vowelsAndConsonantV3 :: " + vowelsAndConsonantV3);

    }

    private static void displayExecutionTime(long time) {
        System.out.println("Execution time :: " + time + " ns " + " (" + TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms) ");
    }
}
