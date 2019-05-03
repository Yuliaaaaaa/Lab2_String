package com.Yulia.workWithText.systems;


public class RegexHandler {
    public static final String REGEX_STARTER = "[";
    public static final String REGEX_END = "]";
    public static final String ANOTHER_TEXT = ".+";
    public static final String REGEX_GROUP_STARTER = "(";
    public static final String OR = "|";
    public static final String REGEX_GROUP_END = ")";
    private static String regex;

    public static String getRegex() {
        return regex;
    }

    public static void generateRegexWithSeparateSymbols(char[] firstChars, char[] lastChars) {
        StringBuilder regex = new StringBuilder(REGEX_STARTER);
        for (int i = 0; i < firstChars.length; i++) {
            regex.append(Character.toUpperCase(firstChars[i]));
            regex.append(Character.toLowerCase(firstChars[i]));
        }
        regex.append(REGEX_END);
        regex.append(ANOTHER_TEXT);
        regex.append(REGEX_STARTER);
        for (int i = 0; i < lastChars.length; i++) {
            regex.append(Character.toUpperCase(lastChars[i]));
            regex.append(Character.toLowerCase(lastChars[i]));
        }
        regex.append(REGEX_END);
        RegexHandler.regex = regex.toString();
    }

    public static void generateRegexWithSubstringsOfSymbols(char[] firstChars, char[] lastChars) {
        StringBuilder regex = new StringBuilder();
        for (int i = 0; i < firstChars.length; i++) {
            regex.append(REGEX_GROUP_STARTER).
                    append(Character.toUpperCase(firstChars[i])).
                    append(OR).
                    append(Character.toLowerCase(firstChars[i])).
                    append(REGEX_GROUP_END);
        }
        regex.append(".+");
        for (int i = 0; i < lastChars.length; i++) {
            regex.append(REGEX_GROUP_STARTER).
                    append(Character.toUpperCase(lastChars[i])).
                    append(OR).
                    append(Character.toLowerCase(lastChars[i])).
                    append(REGEX_GROUP_END);
        }
        RegexHandler.regex = regex.toString();
    }


}
