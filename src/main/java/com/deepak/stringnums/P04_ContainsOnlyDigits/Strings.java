package com.deepak.stringnums.P04_ContainsOnlyDigits;

public class Strings {

    public static boolean containsOnlyDigitsV1(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsOnlyDigitsV2(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        return str.chars()
                .anyMatch(n -> !Character.isDigit(n));
    }

    public static boolean containsOnlyDigitsV3(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        return str.matches("[0-9]+");
    }

}
