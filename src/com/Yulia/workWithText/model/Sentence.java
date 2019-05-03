package com.Yulia.workWithText.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {
    private String sentence;
    private String punctuationMarks;

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public void setPunctuationMarks(String punctuationMarks) {
        this.punctuationMarks = punctuationMarks;
    }

    public void excludeSubstring(String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(sentence);
        sentence = matcher.replaceAll("");
    }

    @Override
    public String toString() {
        return sentence + punctuationMarks;
    }
}
