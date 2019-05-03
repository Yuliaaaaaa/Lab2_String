package com.Yulia.workWithText;

import com.Yulia.workWithText.fileWork.BufferedFileWork;
import com.Yulia.workWithText.model.Sentence;
import com.Yulia.workWithText.model.Symbols;
import com.Yulia.workWithText.systems.RegexHandler;
import com.Yulia.workWithText.systems.SentenceDividing;
import com.Yulia.workWithText.systems.TextGenerator;

public class Main {

    public static void main(String[] args) {
       /*char[] firstChars = {'S', 't', 'r'};
       char[] lastChars = {'a'};*/
        char[] firstChars = {'a', 'b', 'c'};
        char[] lastChars = {'d', 'e', 'f', 'g'};
        Symbols symbols = createSymbols(firstChars, lastChars);
        String regex = getRegexWithSeparateSymbols(symbols);
        String text = readTextFromFile();
        text = changeTextsSentences(text, regex);
        writeInFile(text);
    }

    public static Symbols createSymbols(char[] beginningSymbols, char[] endingSymbols) {
        return new Symbols(beginningSymbols, endingSymbols);
    }

    public static String getRegexWithSeparateSymbols(Symbols symbols){
        RegexHandler.generateRegexWithSeparateSymbols(symbols.getBeginningSymbols(), symbols.getEndingSymbols());
        return RegexHandler.getRegex();
    }

    public static String getRegexWithSubstringsOfSymbols(Symbols symbols){
        RegexHandler.generateRegexWithSubstringsOfSymbols(symbols.getBeginningSymbols(), symbols.getEndingSymbols());
        return RegexHandler.getRegex();
    }

    public static String readTextFromFile(){
        return BufferedFileWork.readFromFile();
    }

    public static String changeTextsSentences(String text, String regex){
        Sentence[] sentences = SentenceDividing.divide(text);
        for (Sentence sentence : sentences) {
            sentence.excludeSubstring(regex);
        }
        return TextGenerator.generateText(sentences);
    }

    public static void writeInFile(String text){
        BufferedFileWork.writeInFile(text);
    }
}
