package com.deepak.stringnums.P03_ReverseWords;


import java.util.concurrent.TimeUnit;

public class Main {

    private static final String TEXT = "My high school, the Illinois Mathematics and Science Academy, "
            + "showed me that anything is possible and that you're never too young to think big. "
            + "At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, "
            + "or Fermilab. After graduating, I attended Stanford for a degree in economics and "
            + "computer science.";

    public static void main(String[] args) {
        System.out.println("Input text : \n" + TEXT + "\n");
        System.out.println("Using raw ");

        long startTimeV1 = System.nanoTime();
        String reverseWordV1 = Strings.reverseWordV1(TEXT);
        displayExecutionTime(System.nanoTime() - startTimeV1);
        System.out.println("Reversed : " + reverseWordV1);

        System.out.println("Using Java8 ");

        long startTimeV2 = System.nanoTime();
        String reverseWordV2 = Strings.reverseWordV2(TEXT);
        displayExecutionTime(System.nanoTime() - startTimeV2);
        System.out.println("Reversed : " + reverseWordV2);

        System.out.println("Using inbuild ");

        long startTimeV3 = System.nanoTime();
        String reverseWordV3 = Strings.reverseWordV3(TEXT);
        displayExecutionTime(System.nanoTime() - startTimeV3);
        System.out.println("Reversed : " + reverseWordV3);


    }

    private static void displayExecutionTime(long time) {
        System.out.println("Execution time :: " + time + " ns " + " (" + TimeUnit.MILLISECONDS.convert(time, TimeUnit.NANOSECONDS) + " ms) ");
    }
}
