package com.deepak.stringnums.P10_GeneratePermutation;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Strings {

    public static void permuteAndPrint(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        permuteAndPrint("", str);
    }

    private static void permuteAndPrint(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.print(prefix + " ");
        } else {
            for (int i = 0; i < n; i++) {
                permuteAndPrint(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i));
            }
        }
    }

    public static void permuteAndPrintV1(String str, int i) {
        if(i == str.length() -1){
            System.out.print(str + " ");
            return;
        }

        for(int j = i ; j < str.length() ; j++) {
            str = swap(str, i, j);
            permuteAndPrintV1(str, i +1);
            str =swap(str , i, j);
        }

    }

    private static String swap(String str, int i, int j) {
        char[] chars =str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return String.valueOf(chars);
    }

    private static Set<String> permutationAndStore(String str) {
        if (str == null || str.isEmpty()) {
            return Collections.emptySet();
        }
        return permutationAndStore("", str);
    }

    private static Set<String> permutationAndStore(String prefix, String str) {
        Set<String> permutations = new HashSet<>();
        int n = str.length();
        if(n == 0){
            permutations.add(prefix + " ");
        } else {
            for(int i = 0 ; i < n ; i++) {
                permutations.addAll(permutationAndStore(prefix + str.charAt(i),
                        str.substring(i + 1, n) + str.substring(0,i)));
            }
        }
        return permutations;
    }
}
