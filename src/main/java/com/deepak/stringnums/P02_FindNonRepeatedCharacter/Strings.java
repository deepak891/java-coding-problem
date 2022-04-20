package com.deepak.stringnums.P02_FindNonRepeatedCharacter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Strings {

    private static final int EXTENDED_ASCII_CODES = 256;

    private Strings() {
        throw new AssertionError("Cannot be instantiated");
    }

    // Complexity O(n^2), Space O(1)
    public static char firstNonRepeatingCharacterV1(String str) {
        if (str == null || str.isEmpty()) {
            return Character.MIN_VALUE;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j) && i != j) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                return ch;
            }
        }
        return Character.MIN_VALUE;
    }

    //O(n+n)
    public static char firstNonRepeatingCharacterV2(final String str) {
        if (str == null || str.isEmpty()) {
            return Character.MIN_VALUE;
        }
        int[] flags = new int[EXTENDED_ASCII_CODES];

        for (int i = 0; i < EXTENDED_ASCII_CODES; i++) {
            flags[i] = -1;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (flags[ch] == -1) {
                flags[ch] = i;
            } else {
                flags[ch] = -2;
            }
        }

        int position = Integer.MAX_VALUE;
        for (int i = 0; i < EXTENDED_ASCII_CODES; i++) {
            if (flags[i] >= 0) {
                position = Math.min(position, flags[i]);
            }
        }
        return position == Integer.MAX_VALUE ? Character.MIN_VALUE : str.charAt(position);
    }

    public static char firstNonRepeatingCharacterV3(final String str) {
        if (str == null || str.isEmpty()) {
            return Character.MIN_VALUE;
        }

        Map<Character, Integer> chars = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            chars.compute(ch, (k, v) -> v == null ? 1 : ++v);
        }

        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return Character.MIN_VALUE;
    }

    public static char firstNonRepeatingCharacterV4(final String str) {
        if (str == null || str.isEmpty()) {
            return Character.MIN_VALUE;
        }

        final Map<Integer, Long> chars = str.chars()
                .mapToObj(cp -> cp)
                .collect(Collectors.groupingBy(ch -> ch,
                        LinkedHashMap::new, Collectors.counting()));


        return (char) (int) chars.entrySet()
                .stream().filter(e -> e.getValue() == 1L)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(Integer.valueOf(Character.MAX_VALUE));
    }

    public static String firstNonRepeatingCharacterCPV4(final String str) {
        if (str == null || str.isEmpty()) {
            return String.valueOf(Character.MIN_VALUE);
        }

        Map<Integer, Long> chs = str.codePoints()
                .mapToObj(cp -> cp)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()));

        final Integer cp = chs.entrySet().stream()
                .filter(e -> e.getValue() == 1L)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(Integer.valueOf(Character.MAX_VALUE));

        return String.valueOf(Character.toChars(cp));
    }

}
