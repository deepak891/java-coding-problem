package com.deepak.stringnums.P24_TransformString;

import java.util.stream.Stream;

public class Strings {

    public static String transform(String str) {
        return Stream.of(str)
                .map( s -> s + " some word")
                .findFirst()
                .get();
    }

    public static String transformV1(String str) {
        return Stream.of(str)
                .map( String::toUpperCase)
                .map( s -> s.repeat(2))
                .findFirst()
                .get();
    }


}
