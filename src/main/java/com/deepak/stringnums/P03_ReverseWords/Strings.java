package com.deepak.stringnums.P03_ReverseWords;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Strings {

    private static final Pattern PATTERN = Pattern.compile(" +");
    private static final String WHITESPACE = " ";

    public static String reverseWordV1(final String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        String[] words = str.split(WHITESPACE);
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord.append(word.charAt(i));
            }

            reversedString.append(reverseWord).append(WHITESPACE);
        }
        return reversedString.toString();
    }

    public static String reverseWordV2(final String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        return PATTERN.splitAsStream(str)
                .map(w -> new StringBuilder(w).reverse())
                .collect(Collectors.joining(WHITESPACE));
    }

    public static String reverseWordV3(final String str) {

        if (str == null || str.isEmpty()) {
            return "";
        }

        return new StringBuilder(str).reverse().toString();
    }
}
