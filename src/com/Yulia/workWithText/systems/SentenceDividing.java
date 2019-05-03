package com.Yulia.workWithText.systems;

import com.Yulia.workWithText.model.Sentence;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceDividing {
    private final static String regex = "[.?!;]+[ \t\n]+";

    public static Sentence[] divide(String text) {
        Pattern pattern = Pattern.compile(regex);
        String[] sentencesStr = pattern.split(text);
        Matcher matcher = pattern.matcher(text);
        Sentence[] sentences = new Sentence[sentencesStr.length];
        int i = 0;
        for (String sentenceStr : sentencesStr) {
            sentences[i] = new Sentence(sentenceStr);
            i++;
        }
        i = 0;
        while (matcher.find()) {
            sentences[i].setPunctuationMarks(matcher.group());
            i++;
        }
        return sentences;
    }
}
