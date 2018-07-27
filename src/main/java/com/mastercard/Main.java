package com.mastercard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        EnglishSentenceService englishSentenceService = new EnglishSentenceService();

        System.out.print("Please enter the sentence:");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        SentenceResult result =englishSentenceService.findFirstLongestWord(sentence);
        System.out.println("The largest word in your sentence is "+ result.getLongestWord());
        System.out.println("The largest word's length is  "+ result.getLongestWordLength());

    }
}
