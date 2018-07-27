package com.mastercard;

import com.mastercard.service.EnglishSentenceService;
import com.mastercard.service.LongesWordResult;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        EnglishSentenceService englishSentenceService = new EnglishSentenceService();

        System.out.print("Please enter the sentence:");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        LongesWordResult result =englishSentenceService.findLongestWord(sentence);
        System.out.println("The largest word in your sentence is "+ result.getLongestWord());
        System.out.println("The largest word's length is  "+ result.getLongestWordLength());

    }
}
