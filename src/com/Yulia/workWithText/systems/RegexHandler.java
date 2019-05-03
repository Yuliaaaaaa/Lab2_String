package com.Yulia.workWithText.systems;


public class RegexHandler {
    private static String regex;

    public static String getRegex() {
        return regex;
    }

    public static void generate(char[] firstChars, char[] lastChars) {
        String regex = "[";
        for (int i = 0; i < firstChars.length; i++) {
            regex += firstChars[i];
            if (Character.isLowerCase(firstChars[i]))
                regex += Character.toUpperCase(firstChars[i]);
            else
                regex += Character.toLowerCase(firstChars[i]);
        }
        regex += "].+";
        regex += "[";
        for (int i = 0; i < lastChars.length; i++) {
            regex += lastChars[i];
            if (Character.isLowerCase(lastChars[i]))
                regex += Character.toUpperCase(lastChars[i]);
            else
                regex += Character.toLowerCase(lastChars[i]);
        }
        regex += "]";
        RegexHandler.regex = regex;
    }

    public static void generateAnother(char[] firstChars, char[] lastChars) {
        String regex = "";
        for (int i = 0; i < firstChars.length; i++) {
            regex += "(" + firstChars[i] + "|";
            if (Character.isLowerCase(firstChars[i]))
                regex += Character.toUpperCase(firstChars[i]);
            else
                regex += Character.toLowerCase(firstChars[i]);
            regex += ")";
        }
        regex += ".+";
        for (int i = 0; i < lastChars.length; i++) {
            regex += "(" + lastChars[i] + "|";
            if (Character.isLowerCase(lastChars[i]))
                regex += Character.toUpperCase(lastChars[i]);
            else
                regex += Character.toLowerCase(lastChars[i]);
            regex += ")";
        }
        RegexHandler.regex = regex;
    }


}
