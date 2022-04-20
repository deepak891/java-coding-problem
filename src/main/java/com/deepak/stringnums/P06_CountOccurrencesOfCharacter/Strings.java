package com.deepak.stringnums.P06_CountOccurrencesOfCharacter;

public class Strings {

    public static int countOccurrencesOfCertainCharactersV1(String str, char ch) {
        if (str == null || str.isBlank()) {
            return -1;
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if (character == ch) {
                count++;
            }
        }
        return count;
    }

    public static int countOccurrencesOfCertainCharactersVCP1(String str, String ch) {
        if (str == null || str.isBlank() || ch == null || ch.isBlank()) {
            return -1;
        }

        if (ch.codePointCount(0, ch.length()) > 1) {
            return -1;//there is more than 1 character in unicode
        }

        int count = 0;
        final int codePointAt = ch.codePointAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.codePointAt(i) == codePointAt) {
                count++;
            }
        }
        return count;
    }

    public static int countOccurrencesOfCertainCharactersV2(String str, char ch) {
        if (str == null || str.isBlank()) {
            return -1;
        }

        return str.length() - str.replace(String.valueOf(ch), "").length();
    }

    public static long countOccurrencesOfCertainCharactersV3(String str, char ch) {
        if (str == null || str.isBlank()) {
            return -1;
        }

        final long count = str.chars()
                .mapToObj(character -> (char) character)
                .filter(character -> ch == character)
                .count();
        return count;
    }

    public static long countOccurrencesOfCertainCharactersVCP2(String str, String ch) {
        if (str == null || str.isBlank() || ch == null || ch.isBlank()) {
            return -1;
        }

        if (ch.codePointCount(0, ch.length()) > 1) {
            return -1;//there is more than 1 character in unicode
        }

        final int codePoint = ch.codePointAt(0);
        final long count = str.chars()
                .mapToObj(c -> String.valueOf(c))
                .filter(cpStr -> cpStr.equals(codePoint))
                .count();
        return count;
    }

}
