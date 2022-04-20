package com.deepak.stringnums.P02_FindNonRepeatedCharacter;

import java.util.concurrent.TimeUnit;

public class Main {

    private static final String TEXT = "abcabcDeepak";

    // Ӝ -> Unicode: \u04DC, Code Point: 1244
    // 💕 -> Unicode: \uD83D\uDC95, Code Point: 128149
    private static final String TEXT_CP = "😍 💕 I Ӝ love you Ӝ so much 😍";

    public static void main(String[] args) {

        System.out.println("Input text : \n" + TEXT + "\n");
        System.out.println("Loop and break solution ");
        long startTimeV1 = System.nanoTime();
        char firstCharV1 = Strings.firstNonRepeatingCharacterV1(TEXT);
        displayExecutionTime(System.nanoTime() - startTimeV1);
        System.out.println("Found character: " + firstCharV1);

        System.out.println();
        System.out.println("ASCII Array Solution  ");
        long startTimeV2 = System.nanoTime();
        char firstCharV2 = Strings.firstNonRepeatingCharacterV2(TEXT);
        displayExecutionTime(System.nanoTime() - startTimeV2);
        System.out.println("Found character: " + firstCharV2);

        System.out.println();
        System.out.println("LinedHashMap Solution  ");
        long startTimeV3 = System.nanoTime();
        char firstCharV3 = Strings.firstNonRepeatingCharacterV3(TEXT);
        displayExecutionTime(System.nanoTime() - startTimeV3);
        System.out.println("Found character: " + firstCharV3);

        System.out.println();
        System.out.println("LinedHashMap Solution Java 8");
        long startTimeV4 = System.nanoTime();
        char firstCharV4 = Strings.firstNonRepeatingCharacterV4(TEXT);
        displayExecutionTime(System.nanoTime() - startTimeV4);
        System.out.println("Found character: " + firstCharV4);


        System.out.println();
        System.out.println("LinedHashMap Solution codepoint Java 8");
        long startTimeV5 = System.nanoTime();
        String firstCharV5 = Strings.firstNonRepeatingCharacterCPV4(TEXT_CP);
        displayExecutionTime(System.nanoTime() - startTimeV5);
        System.out.println("Found character: " + firstCharV5);


    }

    private static void displayExecutionTime(long time) {
        System.out.println("Execution time :: " + time + " ns " + " (" + TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms) ");
    }
}
