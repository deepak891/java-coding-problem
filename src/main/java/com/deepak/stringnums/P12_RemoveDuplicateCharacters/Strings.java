package com.deepak.stringnums.P12_RemoveDuplicateCharacters;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Strings {

    public static String removeDuplicateV1(String str) {
        if(str == null || str.isEmpty() ) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < str.length() ; i++) {
            if(sb.indexOf(String.valueOf(str.charAt(i))) == -1) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String removeDuplicateV2(String str) {
        if(str == null || str.isEmpty() ) {
            return "";
        }

        return Arrays.asList(str.split(""))
                .stream()
                .distinct()
                .collect(Collectors.joining());
    }
}
