package com.mastercard.service;

public interface SentenceService {
    public LongesWordResult findLongestWord(String sentence);
    public LongesWordResult[] findAllLongestWords(String sentence);
}
