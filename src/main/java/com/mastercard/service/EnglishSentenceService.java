package com.mastercard.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EnglishSentenceService implements SentenceService {

    /*

        Assumptions :
               1.When null or empty I assumed output to be null and empty string respectively and length will be 0.

               2.When input is other than english language it simply processes it as english sentence .

               3.When sentence has more than one longest word then findLongestWord() only returns first longest word in a sentence.

               4.However I have created bonus method called findAllLongestWord() where it will give all the longest words.
                 I kept it as separate method because time complexity varies for both methods.

               5.I have also created concise version of above methods called findLongestWord2() and findAllLongestWords2().
                 These methods are concise but time and space complexity increased.

   */

        /*
            Below algorithm has  Time complexity  O(N) and Space complexity O(1)

            I havent used string.split or StringTokenizer in this method because doing so will increase the Time and space complexity
           .I wrote a method called findLongestWord2 where it uses string.split.
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
                for(int i=0;i<sentence.length();i++){ //O(n)
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

                String word = sentence.substring(resultIndex,resultIndex+max); //O(n)
                result= new LongestWordResult(word);
                return result;
        }


    /**
         *
         *
         *
         * BONUS code test
         *
         *  findLongestWord only returns one longest word even If it has more that one longest words
         * .Since this is take home test i cannot   ask anyone to clarify  ,
         *  but during test cases scenario i had this test case so making code for it.
         *
         * Time complexity O(n) where n is total length of string and
         *
         * Space complexity O(k)   k is number of words in string
         *
         *
         */
        public LongestWordResult[] findAllLongestWords(String sentence){

            if(sentence == null || sentence.length()==0) {
                  LongestWordResult[] results  = new LongestWordResult[1];
                  results[0] = new LongestWordResult(sentence);
                  return  results;
            }
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
                    resultIndeces.clear(); //this operation seems to be O(k) at every iteration but its not ,
                                           // its constant at every iteration and O(K) by the end of iteration
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
        *  Below code is using String.split function . We have concise code but time and space complexity increased
        *  Time complexity : O(n)
        *  Space complexity: O(n)
        *
        * */
        public  LongestWordResult  findLongestWord2(String sentence){
            if(sentence == null || sentence.length()==0) {
                return new LongestWordResult(sentence);
            }
            sentence = removePunctuations(sentence);
            String[] words = sentence.split(" ");// space:O(n)
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

       /*Below code is using String.split method. We have concise code but the time and space complexity increased
       *
       * Time complexity : O(n)
       * Space complexity: O(n)
       * */
         public LongestWordResult[] findAllLongestWords2(String sentence){
             if(sentence == null || sentence.length()==0) {
                 LongestWordResult[] results  = new LongestWordResult[1];
                 results[0] = new LongestWordResult(sentence);
                 return  results;
             }
             sentence = removePunctuations(sentence);
             String[] words = sentence.split(" ");// space:O(n)
             List<LongestWordResult> longestWords = new ArrayList<LongestWordResult>();
             int longestWordLength =Integer.MIN_VALUE;
             for(String word:words){ //O(k)
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
