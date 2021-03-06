package com.mastercard.service;

public class LongestWordResult {

    private String word;

    public LongestWordResult(final String word) {
        this.word=word;
    }

    public String getLongestWord() {
        if(word  == null){
            return "";
        }
        return word;
    }

    public int getLongestWordLength() {
        if(word == null){
            return  0;
        }
        return word.length();
    }
}
