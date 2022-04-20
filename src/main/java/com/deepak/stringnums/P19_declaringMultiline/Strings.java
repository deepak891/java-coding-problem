package com.deepak.stringnums.P19_declaringMultiline;

public class Strings {

    private static final String LS = System.lineSeparator();
    public static void declaringMultiLine(){
        String.join(LS,
        "My high school, ",
        "the Illionis Mathematics and Science Academy,",
        "showed me that anything is possible ");

        String.format("%s" + LS + "%s" +LS + "%s",
                "My high school, ",
                "the Illionis Mathematics and Science Academy,",
                "showed me that anything is possible ");
    }
}
