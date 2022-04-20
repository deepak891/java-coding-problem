package com.deepak.stringnums.P06_CountOccurrencesOfCharacter;

import java.util.concurrent.TimeUnit;

public class Main {

    private static final String TEXT = "My high school, the Illinois Mathematics and Science Academy, "
            + "showed me that anything is possible and that you're never too young to think big. "
            + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
            + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
            + "computer science.";
    private static final char CHAR_TO_COUNT = 'u';

    private static final String TEXT_CP = "😍 I love 💕 you Ӝ so much 💕 😍";
    private static final String CHAR_TO_COUNT_CP = "Ӝ";   // Unicode: \u04DC, Code Point: 1244
    private static final String CHAR_TO_COUNT_CPS = "💕"; // Unicode: \uD83D\uDC95, Code Point: 128149

    public static void main(String[] args) {
        System.out.println(" Input text : \n " + TEXT + " \n");

        System.out.println("Using for count");
        long startTime1 = System.nanoTime();
        final int countOccurrencesOfCertainCharactersV1 = Strings.countOccurrencesOfCertainCharactersV1(TEXT, CHAR_TO_COUNT);
        displayExecutionTime(System.nanoTime() - startTime1);
        System.out.println("countOccurrencesOfCertainCharactersV1 ::" + countOccurrencesOfCertainCharactersV1);

        System.out.println();
        System.out.println("Using replace");
        long startTime2 = System.nanoTime();
        final int countOccurrencesOfCertainCharactersV2 = Strings.countOccurrencesOfCertainCharactersV2(TEXT, CHAR_TO_COUNT);
        displayExecutionTime(System.nanoTime() - startTime2);
        System.out.println("countOccurrencesOfCertainCharactersV2 ::" + countOccurrencesOfCertainCharactersV2);

        System.out.println();
        System.out.println("Using Java 8");
        long startTime3 = System.nanoTime();
        final long countOccurrencesOfCertainCharactersV3 = Strings.countOccurrencesOfCertainCharactersV3(TEXT, CHAR_TO_COUNT);
        displayExecutionTime(System.nanoTime() - startTime3);
        System.out.println("countOccurrencesOfCertainCharactersV3 ::" + countOccurrencesOfCertainCharactersV3);

        System.out.println();
        System.out.println("Using Java 8 code point");
        long startTime4 = System.nanoTime();
        final long countOccurrencesOfCertainCharactersVCP1 = Strings.countOccurrencesOfCertainCharactersVCP1(TEXT_CP, CHAR_TO_COUNT_CP);
        displayExecutionTime(System.nanoTime() - startTime4);
        System.out.println("countOccurrencesOfCertainCharactersV3 ::" + countOccurrencesOfCertainCharactersVCP1);



    }

    private static void displayExecutionTime(long time) {
        System.out.println("Execution time :: " + time + " ns " + " (" + TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms) ");
    }
}
