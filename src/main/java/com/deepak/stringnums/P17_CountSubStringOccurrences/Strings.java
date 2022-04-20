package com.deepak.stringnums.P17_CountSubStringOccurrences;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings {

    public static int countStringInStringV1(String string, String toFind) {
        int position = 0;
        int count = 0;
        int n = toFind.length();

        while ((position = string.indexOf(toFind, position)) != -1) {
            position = position+n;
            count++;
        }
        return count;
    }

    public static int countStringInStringV2(String string, String toFind) {
        int result = string.split(Pattern.quote(toFind), -1).length -1;
        return  result < 0 ? 0 : result;
    }

    public static int countStringInStringV3(String string, String toFind) {
        Pattern pattern = Pattern.compile(Pattern.quote(toFind));
        Matcher matcher = pattern.matcher(string);

        int position = 0 ;
        int count = 0;

        while (matcher.find(position)) {
            position = matcher.start() + 1;
            count++;
        }

        return count;
    }
}
