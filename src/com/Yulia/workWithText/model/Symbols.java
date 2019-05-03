package com.Yulia.workWithText.model;

public class Symbols {
    private char[] beginningSymbols;
    private char[] endingSymbols;

    public Symbols(char[] beginningSymbols, char[] endingSymbols) {
        this.beginningSymbols = beginningSymbols;
        this.endingSymbols = endingSymbols;
    }



    public void setBeginningSymbols(char[] beginningSymbols) {
        this.beginningSymbols = beginningSymbols;
    }

    public void setEndingSymbols(char[] endingSymbols) {
        this.endingSymbols = endingSymbols;
    }

    public char[] getBeginningSymbols() {
        return beginningSymbols;
    }

    public char[] getEndingSymbols() {
        return endingSymbols;
    }
}
