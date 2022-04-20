package com.deepak.stringnums.P09_JoinMultipleStrings;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Strings {

    public static String joinByDelimiterV1(char delimiter, String... args) {
        if(args == null || args.length == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int i = 0 ;
        for( i = 0 ; i < args.length -1; i++) {
            result.append(args[i]).append(delimiter);
        }
        result.append(args[i]);
        return  result.toString();
    }

    public static String joinByDelimiterV2(char delimiter, String... args) {
        if(args == null || args.length == 0) {
            return "";
        }

        return Arrays.stream(args)
                .collect(Collectors.joining(String.valueOf(delimiter)));
    }

    public static String joinByDelimiterV3(char delimiter, String... args) {
        if (args == null || args.length == 0) {
            return "";
        }

        StringJoiner joiner = new StringJoiner(String.valueOf(delimiter));

        for( String arg : args) {
            joiner.add(arg);
        }
        return joiner.toString();
    }

}
