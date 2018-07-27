package com.mastercard;



import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class EnglishSentenceService {
            /*

            My below algorithm has  Time complexity  O(N) and Space complexity O(1)



        Assumptions :
                    1.When null or empty i assumed output to be null and empty string respective and length will be 0
                    2.When input is other than english language it simply processes it as english letters
                    3.When sentence has more than one longest word then it only returns first found longest word.
                      However i have created new bonus method called findAllLongestWords() where it will give all the longest words.
                      I kept it as seprate method because time complexity varies for both methods

                */
        public SentenceResult findLongestWord(String sentence) {
                SentenceResult result = null;
                if(sentence == null || sentence.length()==0) {
                    return new SentenceResult(sentence);
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
                result= new SentenceResult(word);
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
        public SentenceResult[] findAllLongestWords(String sentence){

            if(sentence == null || sentence.length()==0) {
                  SentenceResult[] results  = new SentenceResult[1];
                  results[0] = new SentenceResult(sentence);
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
            SentenceResult[] results = new SentenceResult[resultIndeces.size()];
            int i=0;
            for(Integer resultIndex:resultIndeces){
                String word = sentence.substring(resultIndex,resultIndex+max);
                SentenceResult result= new SentenceResult(word);
                results[i]=result;
                i++;
            }
            return results;
        }


        private String removePunctuations(String sentence) {
            sentence = sentence.replaceAll("[\\p{Punct}]", "");
            return sentence;
        }


}
