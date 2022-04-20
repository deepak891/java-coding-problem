package com.deepak.stringnums.P08_RemoveWhiteSpaceFromString;

public class Strings {

    public static String removeWhiteSpaces(String str) {
        if(str == null || str.isEmpty()) {
            return "";
        }

        return str.replaceAll("\\s","");
    }
}
