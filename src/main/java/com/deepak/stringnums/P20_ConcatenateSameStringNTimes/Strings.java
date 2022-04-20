package com.deepak.stringnums.P20_ConcatenateSameStringNTimes;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Strings {

    public static String concatRepeat(String str, int n) {
        StringBuilder sb = new StringBuilder(str.length() * n);
        for (int i = 1; i <= n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static String concatRepeatV2(String str, int n) {
        return str.repeat(5);
    }

    public static String concatRepeatV3(String str, int n) {
        return String.join("", Collections.nCopies(5, str));
    }

    public static String concatRepeatV4(String str, int n) {
        return Stream.generate(() -> str)
                .limit(5)
                .collect(Collectors.joining());
    }

}
