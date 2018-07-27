package com.mastercard.service;

public class LongestWordResult {

    private String word; //incase more than one word found which is longest

    public LongestWordResult(final String word) {
        this.word=word;
    }

    public String getLongestWord() {
        return word;
    }

    public int getLongestWordLength() {
        if(word == null){
            return  0;
        }
        return word.length();
    }
}
