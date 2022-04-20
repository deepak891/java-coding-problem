package com.deepak.stringnums.P11_CheckPalindrome;

import java.util.stream.IntStream;

public class Strings {

    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeV1(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        return IntStream.range(0, str.length() / 2)
                .noneMatch(p -> str.charAt(p) != str.charAt(str.length() - p - 1));
    }
}
