package com.mastercard;

public class SentenceResult {

    private String word; //incase more than one word found which is longest

    public SentenceResult(final String word) {
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
