package com.mastercard.service;

public interface SentenceService {
    public LongestWordResult findLongestWord(String sentence);
    public LongestWordResult[] findAllLongestWords(String sentence);
    public  LongestWordResult findLongestWordConcise(String sentence);
    public LongestWordResult[] findAllLongestWordsConcise(String sentence);
}
