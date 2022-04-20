package com.deepak.stringnums.P01_CountDuplicateCharacters;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Strings {

    public static Map<Character, Integer> countDuplicateCharactersV1(final String str) {
        if (str == null || str.isBlank()) {
            return Collections.emptyMap();
        }

        Map<Character, Integer> result = new HashMap<>();
        for (Character ch : str.toCharArray()) {
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        return result;
    }

    public static Map<String, Integer> countDuplicateCharactersVCP1(final String str) {
        if (str == null || str.isBlank()) {
            return Collections.emptyMap();
        }
        Map<String, Integer> result = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int cp = str.codePointAt(i);
            String ch = String.valueOf(Character.toChars(cp));
            if (Character.charCount(cp) == 2) {
                i++;
            }
            result.compute(ch, (k, v) -> v == null ? 1 : ++v);
        }
        return result;
    }

    public static  Map<Character, Long> countDuplicateCharactersV2(final String str) {
        if (str == null || str.isBlank()) {
            return Collections.emptyMap();
        }

        final Map<Character, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return result;
    }

    public static Map<String, Long> countDuplicateCharactersVCP2(final String str) {
        if (str == null || str.isBlank()) {
            return Collections.emptyMap();
        }
        final Map<String, Long> result = str.codePoints()
                .mapToObj(c -> String.valueOf(Character.toChars(c)))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return result;
    }

}
