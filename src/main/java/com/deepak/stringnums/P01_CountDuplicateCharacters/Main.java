package com.deepak.stringnums.P01_CountDuplicateCharacters;

import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Main {

    private static final String TEXT = "Be strong, be fearless, be beautiful. "
            + "And believe that anything is possible when you have the right "
            + "people there to support you. ";
    // Ӝ -> Unicode: \u04DC, Code Point: 1244
    // 💕 -> Unicode: \uD83D\uDC95, Code Point: 128149
    // 🎼 -> \uD83C\uDFBC, Code Point: 127932
    // 😍 ->\uD83D\uDE0D, Code Point: 128525
    private static final String TEXT_CP = TEXT + "😍 I love 💕 you Ӝ so much 💕 😍 🎼🎼🎼!";

    public static void main(String[] args) {
        Strings strings = new Strings();
        System.out.println("Input text : \n " + TEXT +"\n");
        //Hashmap based solution
        long startTimeV1 = System.nanoTime();
        Map<Character, Integer> duplicateV1 = Strings.countDuplicateCharactersV1(TEXT);
        displayExecutionTime(System.nanoTime() - startTimeV1);
        System.out.println(Arrays.toString(duplicateV1.entrySet().toArray()));

        System.out.println("Java 8 Functional Style");
        long startTimeV2 = System.nanoTime();
        Map<Character, Long> duplicateV2 = Strings.countDuplicateCharactersV2(TEXT);
        displayExecutionTime(System.nanoTime() - startTimeV2);
        System.out.println(Arrays.toString(duplicateV2.entrySet().toArray()));


        System.out.println("========================");
        System.out.println("Input text: \n" + TEXT_CP + "\n");
        long startTimeV3 = System.nanoTime();
        Map<String, Integer> duplicateV3 = Strings.countDuplicateCharactersVCP1(TEXT_CP);
        displayExecutionTime(System.nanoTime() - startTimeV3);
        System.out.println(Arrays.toString(duplicateV3.entrySet().toArray()));

        long startTimeV4 = System.nanoTime();
        Map<String, Long> duplicateV4 = Strings.countDuplicateCharactersVCP2(TEXT_CP);
        displayExecutionTime(System.nanoTime() - startTimeV4);
        System.out.println(Arrays.toString(duplicateV4.entrySet().toArray()));

    }

    private static void displayExecutionTime(long time) {
        System.out.println("Execution time :: " + time + " ns " + " (" + TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms) ");
    }
}
