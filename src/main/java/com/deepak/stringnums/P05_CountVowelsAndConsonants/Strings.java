package com.deepak.stringnums.P05_CountVowelsAndConsonants;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Strings {

    private static final Set<Character> allVowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public static Pair<Integer, Integer> countVowelsAndConsonantV1(String str) {
        if (str == null || str.isBlank()) {
            return Pair.of(-1, -1);
        }

        int vowels = 0, consonants = 0;
        for (Character ch : str.toCharArray()) {
            if (allVowels.contains(ch)) {
                vowels++;
            } else {
                consonants++;
            }
        }
        return Pair.of(vowels, consonants);
    }

    public static Pair<Long, Long> countVowelsAndConsonantV2(String str) {
        if (str == null || str.isBlank()) {
            return Pair.of(-1L, -1L);
        }

        final Map<Boolean, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c >= 'a' && c <= 'z')
                .collect(Collectors.partitioningBy(c -> allVowels.contains(c), Collectors.counting()));

        return Pair.of(result.get(true), result.get(false));
    }

    public static Pair<Long, Long> countVowelsAndConsonantV3(String str) {
        if (str == null || str.isBlank()) {
            return Pair.of(-1L, -1L);
        }

        final long vowels = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> allVowels.contains(c))
                .count();

        final long consonants = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c >= 'a' && c <= 'z')
                .filter(c -> !allVowels.contains(c))
                .count();

        return Pair.of(vowels, consonants);
    }

}
