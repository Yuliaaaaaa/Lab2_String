package com.Yulia.workWithText.systems;

import com.Yulia.workWithText.model.Sentence;

public class TextGenerator {
    public static String generateText(Sentence[] sentences) {
        String text = "";
        for (int i = 0; i < sentences.length; i++) {
            text += sentences[i];
        }
        return text;
    }
}
