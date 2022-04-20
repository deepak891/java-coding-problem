package com.deepak.stringnums.P14_FindCharacterWithMostAppearances;

import com.deepak.stringnums.P05_CountVowelsAndConsonants.Pair;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Strings {
    public static Pair<Character, Integer> maxOccurenceCharacter(String str) {
        Map<Character, Integer> counter = new HashMap<>();
        char[] chStr = str.toCharArray();

        for(int i = 0 ; i < chStr.length ; i++) {
            char currentCh = chStr[i];
            if(!Character.isWhitespace(currentCh)){
                Integer noCh = counter.get(currentCh);
                if(noCh == null) {
                    counter.put(currentCh, 1);
                } else {
                    counter.put(currentCh, ++noCh);
                }
            }
        }

        int maxOccurences = Collections.max(counter.values());
        char maxCharacter = Character.MIN_VALUE;

        for(Map.Entry<Character, Integer> entry: counter.entrySet()) {
            if(entry.getValue() == maxOccurences) {
                maxCharacter = entry.getKey();
            }
        }
        return Pair.of(maxCharacter, maxOccurences);
    }

    public static Pair<Character, Integer> maxOccurenceCharacterV2(String str) {
        int[] asciiChar = new int[256];
        char[] chars = str.toCharArray();
        int maxOccurances = -1;
        char maxCharacter = Character.MIN_VALUE;

        for(int i = 0 ; i < chars.length ; i++) {
            char currentCh = chars[i];
            if(!Character.isWhitespace(currentCh)) {
                int code = (int) currentCh;
                asciiChar[code]++;
                if(asciiChar[code] > maxOccurances) {
                    maxOccurances = asciiChar[code];
                    maxCharacter = currentCh;
                }
            }
        }
        return Pair.of(maxCharacter, maxOccurances);
    }

    public static Pair<Character, Long> maxOccurenceCharacterV3(String str) {
        return str
                .chars()
                .filter( c -> Character.isWhitespace(c) == false)
                .mapToObj( c -> (char) c)
                .collect(groupingBy(c -> c, counting()))
                .entrySet()
                .stream()
                .max(comparingByValue())
                .map( p -> Pair.of(p.getKey(), p.getValue()))
                .orElse(Pair.of(Character.MIN_VALUE, -1L));
    }

}
