package com.mastercard;



import java.util.regex.Pattern;

public class EnglishSentenceService {
    /*

    My below algorithm has  Time complexity  O(N) and Space complexity O(1)

    on contrary if coded using String.split(' ') and stored in array or list and then look at length of each word
     that algorithm  would have been time complexity : O(n+k) and space complexity O(k)
      where n is length of sentence and k is number of words in sentence


     */
    public SentenceResult findLongestWord(final String sentence) {
        SentenceResult result = null;

        if(sentence == null || sentence.length()==0) {
            return new SentenceResult(sentence);
        }
        if(!isEnglishSentence(sentence)){
            throw  new IllegalArgumentException("this service only accepts english sentences as input");
        }
        int max = Integer.MIN_VALUE;
        int wordBeginIndex =0;
        int counter=0;
        int resultIndex =0;
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)!=' ') {
                counter++;
            }
            else {
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


    //TODO: this method  determines english sentences in very limted way,It doesnt consider all the characters contians in english sentence.
    // TODO:Full implementation of this method  is out of scope of this test.Based on discussion i may remove support of english language only check from program.
    private boolean isEnglishSentence(String sentence) {
       return Pattern.matches("[a-zA-Z\\.,'0-9\\s]+",sentence);
    }


    /**
     *
     * BONUS code test
     * findLongestWord only returns one longest word even If it has more that one longest word
     * .Since this is take home test i cannot   ask anyone to clarify  , but during test cases scenario i had this test case so making code for it.
     * @return
     */
    public String[] findAllLongestWord(){
        return null;
    }

}
