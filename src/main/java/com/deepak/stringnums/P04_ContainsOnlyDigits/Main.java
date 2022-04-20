package com.deepak.stringnums.P04_ContainsOnlyDigits;

import java.util.concurrent.TimeUnit;

public class Main {

    private static final String ONLY_DIGITS = "45566336754493420932877387482372374982374823"
            + "749823283974232237238472392309230923849023848234580383485342234287943943094"
            + "234745374657346578465783467843653748654376837463847654382382938793287492326";

    private static final String NOT_ONLY_DIGITS = "45566336754493420932877387482372374982374823"
            + "749823283974232237238472392309230923849023848234580383485342234287943943094"
            + "234745374657346578465783467843653748654376837463847654382382938793287492326A";

    public static void main(String[] args) {
        System.out.println("Input text : \n" + ONLY_DIGITS + "\n");
        System.out.println("Input text : \n" + NOT_ONLY_DIGITS + "\n");
        System.out.println("Using Character function ");

        long startTimeV1 = System.nanoTime();
        boolean onlyDigitsV1 = Strings.containsOnlyDigitsV1(ONLY_DIGITS);
        System.out.println("OnlyDigit : " + onlyDigitsV1);
        boolean notOnlyDigitV1 = Strings.containsOnlyDigitsV1(NOT_ONLY_DIGITS);
        displayExecutionTime(System.nanoTime() - startTimeV1);
        System.out.println("OnlyDigit : " + onlyDigitsV1);
        System.out.println("OnlyDigit : " + notOnlyDigitV1);

        System.out.println("Using Java 8 ");
        long startTimeV2 = System.nanoTime();
        boolean onlyDigitsV2 = Strings.containsOnlyDigitsV2(ONLY_DIGITS);
        System.out.println("OnlyDigit : " + onlyDigitsV2);
        boolean notOnlyDigitV2 = Strings.containsOnlyDigitsV2(NOT_ONLY_DIGITS);
        displayExecutionTime(System.nanoTime() - startTimeV2);
        System.out.println("OnlyDigit : " + onlyDigitsV2);
        System.out.println("OnlyDigit : " + notOnlyDigitV2);

        System.out.println("Using Java 8 regx");
        long startTimeV3 = System.nanoTime();
        boolean onlyDigitsV3 = Strings.containsOnlyDigitsV3(ONLY_DIGITS);
        System.out.println("OnlyDigit : " + onlyDigitsV2);
        boolean notOnlyDigitV3 = Strings.containsOnlyDigitsV3(NOT_ONLY_DIGITS);
        displayExecutionTime(System.nanoTime() - startTimeV3);
        System.out.println("OnlyDigit : " + onlyDigitsV3);
        System.out.println("OnlyDigit : " + notOnlyDigitV3);


    }

    private static void displayExecutionTime(long time) {
        System.out.println("Execution time :: " + time + " ns " + " (" + TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms) ");
    }
}
