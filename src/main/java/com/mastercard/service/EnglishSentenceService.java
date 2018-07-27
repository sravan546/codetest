package com.mastercard.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EnglishSentenceService implements SentenceService {

    /*

        Assumptions :
                    1.When null or empty i assumed output to be null and empty string respective and length will be 0
                    2.When input is other than english language it simply processes it as english letters
                    3.When sentence has more than one longest word then it only returns first found longest word.
                      However i have created new bonus method called findAllLongestWords() where it will give all the longest words.
                      I kept it as seprate method because time complexity varies for both methods

   */
        /*
             below algorithm has  Time complexity  O(N) and Space complexity O(1)

            I havent used string.split ot StringTokenizer in this method becasue doing so will increase the Time and space complexity
           .I wrote a method called findLongestWord2 where it uses string.split please see scroll to see
         */
        public LongestWordResult findLongestWord(String sentence) {

                LongestWordResult result = null;
                if(sentence == null || sentence.length()==0) {
                    return new LongestWordResult(sentence);
                }
                    //removing all the punctuation marks
                sentence = removePunctuations(sentence);
                int max = Integer.MIN_VALUE;
                int wordBeginIndex =0;
                int counter=0;
                int resultIndex =0;
                for(int i=0;i<sentence.length();i++){
                    if(sentence.charAt(i)!=' '){
                        counter++;
                    }
                    else{
                        wordBeginIndex=i+1;
                        counter=0;
                    }
                    if(max<counter){
                        resultIndex=wordBeginIndex;
                        max=counter;
                    }
                }

                String word = sentence.substring(resultIndex,resultIndex+max);
                result= new LongestWordResult(word);
                return result;
        }


    /**
         *
         *
         *
         * BONUS code test
         * findLongestWord only returns one longest word even If it has more that one longest word
         * .Since this is take home test i cannot   ask anyone to clarify  , but during test cases scenario i had this test case so making code for it.
         *
         * Time complexity O(n+k) where n is total length of string and
         *                              k is number of words in string
         * Space complexity O(k)
         *
         *
         */
        public LongestWordResult[] findAllLongestWords(String sentence){

            if(sentence == null || sentence.length()==0) {
                  LongestWordResult[] results  = new LongestWordResult[1];
                  results[0] = new LongestWordResult(sentence);
                  return  results;
            }
            //removing all the punctuation marks
            sentence = removePunctuations(sentence);
            int max = Integer.MIN_VALUE;
            int wordBeginIndex =0;
            int counter=0;
            List<Integer> resultIndeces = new ArrayList<Integer>();
            for(int i=0;i<sentence.length();i++){
                if(sentence.charAt(i)!=' '){
                    counter++;
                }
                else{
                    wordBeginIndex=i+1;
                    counter=0;
                }
                if(max<counter){
                    resultIndeces.clear(); //this operation seems to be O(k) at every iteration but its not ,its constant at every iteration and O(K) by the end of iteration
                    resultIndeces.add(wordBeginIndex);
                    max=counter;
                }else if(max==counter){
                    resultIndeces.add(wordBeginIndex);
                }

            }
            LongestWordResult[] results = new LongestWordResult[resultIndeces.size()];
            int i=0;
            for(Integer resultIndex:resultIndeces){
                String word = sentence.substring(resultIndex,resultIndex+max);
                LongestWordResult result= new LongestWordResult(word);
                results[i]=result;
                i++;
            }
            return results;
        }


        /*
        *
        * Below code is using String.split fiuntion . We have concise code but time and space complexity increased
        *  Time complexity : O(n+K)
         * Space complexity: O(n)
         *
        * */
        public  LongestWordResult  findLongestWord2(String sentence){
            if(sentence == null || sentence.length()==0) {
                return new LongestWordResult(sentence);
            }
            sentence = removePunctuations(sentence);
            String[] words = sentence.split(" ");//time:O(n) space:O(n)
            LongestWordResult  result = null;
            int longestWordLength =Integer.MIN_VALUE;
            for(String word:words){  //O(k)
                if(longestWordLength < word.length())  {
                    result = new LongestWordResult(word);
                    longestWordLength=word.length();
                }
            }
            return  result;
        }

       /*this is using java String.split() method. We have concise code but the time and space complexity increased
       *
       * Time complexity : O(n+K)
       * Space complexity: O(n)
       * */
         public LongestWordResult[] findAllLongestWords2(String sentence){
             if(sentence == null || sentence.length()==0) {
                 LongestWordResult[] results  = new LongestWordResult[1];
                 results[0] = new LongestWordResult(sentence);
                 return  results;
             }
             //removing all the punctuation marks
             sentence = removePunctuations(sentence);
             String[] words = sentence.split(" ");//time:O(n) space:O(n)
             List<LongestWordResult> longestWords = new ArrayList<LongestWordResult>();
             int longestWordLength =Integer.MIN_VALUE;
             for(String word:words){  //O(k)
                  if(longestWordLength < word.length())  {
                      longestWords.clear();
                      longestWords.add(new LongestWordResult(word));
                      longestWordLength=word.length();
                  }else if(longestWordLength == word.length()){
                      longestWords.add(new LongestWordResult(word));
                  }
             }
             return  longestWords.toArray(new LongestWordResult[0]);
         }


        private String removePunctuations(String sentence) {
            sentence = sentence.replaceAll("[\\p{Punct}]", "");
            return sentence;
        }


}
