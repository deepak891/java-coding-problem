package com.deepak.stringnums.P16_CheckStringContainsSubString;

import java.util.regex.Pattern;

public class Strings {

    public static boolean containsSubStringV1(String text, String subtext) {
        return text.contains(subtext);
    }

    public static boolean containsSubStringV2(String text, String subtext) {
        return text.indexOf(subtext) != -1;
    }

    public static boolean containsSubStringV3(String text, String subtext) {
        return text.matches("(?i).* +" + Pattern.quote(subtext) + ".*");
    }

}
