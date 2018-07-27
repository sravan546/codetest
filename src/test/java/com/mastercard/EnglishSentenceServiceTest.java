package com.mastercard;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnglishSentenceServiceTest {

    private EnglishSentenceService englishSentenceService;

    @Before
    public void setup(){
        englishSentenceService = new EnglishSentenceService();
    }

    // when null return 0
    //when empty string return 0
    //when too much or double space

    //when number
    //single character
    //when invalid character then return invalid characters
    //when not english language


    //this tests when sentence is null
    @Test
    public void testLongestWordWhenNull(){
        SentenceResult result= englishSentenceService.findLongestWord(null);
        assertResults(result,null,0);
    }


    //this tests when  sentence is empty
    @Test
    public void testLongestWordWhenEmptyString(){
        SentenceResult result= englishSentenceService.findLongestWord("");
        assertResults(result,"",0);
    }


    //this tests legitimate sentence
    @Test
    public void testLongestWordServce(){
        String sentence = "The cow jumped over the moon.";
        SentenceResult result= englishSentenceService.findLongestWord(sentence);
        assertResults(result,"jumped",6);
    }

    //this tests when  uneven space
    @Test
    public void testLongestWordWhenUnevenSpaces(){
        String sentence = "The                   cow jumped over    the  water mountain      .";
        SentenceResult result= englishSentenceService.findLongestWord(sentence);
        assertResults(result,"mountain",8);
    }

    //this tests when  uneven space
    @Test
    public void testLongestWordWhenFirstWordIsLonger(){
        String sentence = "elephant                    jumped over    the  water moon      .";
        SentenceResult result= englishSentenceService.findLongestWord(sentence);
        assertResults(result,"elephant",8);
    }

    //this tests when  uneven space
    @Test
    public void testLongestWordWhenLastWordIsLonger(){
        String sentence = "elephant                    jumped over    the  water mountains";
        SentenceResult result= englishSentenceService.findLongestWord(sentence);
        assertResults(result,"mountains",9);
    }

    //this tests one word sentences
    @Test
    public void testLongestWordWhenOneWord(){
        String sentence = "Jumped";
        SentenceResult result= englishSentenceService.findLongestWord(sentence);
        assertResults(result,"Jumped",6);
    }

    //this tests one letter sentences
    @Test
    public void testLongestWordWhenOneLetter(){
        String sentence = "J";
        SentenceResult result= englishSentenceService.findLongestWord(sentence);
        assertResults(result,"J",1);
    } //this tests one letter sentences
    @Test
    public void testLongestWordWhenIncrementalLetter(){
        String sentence = "j jj jjj jjjj jjjjj jjjjjj jjjjjjj";
        SentenceResult result= englishSentenceService.findLongestWord(sentence);
        assertResults(result,"jjjjjjj",7);
    }

    //this tests when sentences has invisible characters
    @Test
    public void testLongestWordWhenInvisibleCharacters(){
        String sentence = "The            " +
                "                  cow jumped over    the  water mountain      .";
        SentenceResult result= englishSentenceService.findLongestWord(sentence);
        assertResults(result,"mountain",8);
    }




    @Test
    public  void  testLongestWordWhenParagraph(){
        String longestWordInEnglish="Pneumonoultramicroscopicsilicovolcanoconiosis";
        String paragraph="Of resolve to gravity thought my prepare chamber so. Unsatiable entreaties collecting may sympathize nay interested instrument. If continue building numerous of at relation in margaret. Lasted engage roused mother an am at. Other early while if by do to. Missed living excuse as be. Cause heard fat above first shall for. My smiling to he removal weather on anxious. \n" +
                "\n" +
                "Made last it seen went no just when of by. Occasional entreaties comparison me difficulty so themselves. At brother inquiry of offices without do my service. As particular to companions at sentiments. Weather however luckily enquire so certain do. Aware did stood was day under ask. Dearest affixed enquire on explain opinion he. Reached who the mrs joy offices pleased. Towards did colonel article any parties. \n" +
                "\n" +
                "Denote simple fat denied add worthy little use. As some he so high down am week. Conduct esteems by cottage to pasture we winding. On assistance he cultivated considered frequently. Person how having tended direct own day man. Saw sufficient indulgence one own you inquietude sympathize. \n" +
                "\n" +
                "Built purse maids cease her ham new seven among and. Pulled coming wooded tended it answer remain me be. So landlord by we unlocked sensible it. Fat cannot use denied excuse son law. Wisdom happen suffer common the appear ham beauty her had. Or belonging zealously existence as by resources. \n" +
                "\n" +
                "Is allowance instantly strangers applauded discourse so. Separate entrance welcomed sensible laughing why one moderate shy. We seeing piqued garden he. As in merry at forth least ye stood. And cold sons yet with. Delivered middleton therefore me at. Attachment companions man way excellence how her pianoforte. \n" +
                "\n" +
                "You vexed shy mirth now noise. Talked him people valley add use her depend letter. Allowance too applauded now way something recommend. Mrs age men and trees jokes fancy. Pneumonoultramicroscopicsilicovolcanoconiosis pretended engrossed eagerness continued ten. Admitting day him contained unfeeling attention mrs out. \n" +
                "\n" +
                "Spot of come to ever hand as lady meet on. Delicate contempt received two yet advanced. Gentleman as belonging he commanded believing dejection in by. On no am winding chicken so behaved. Its preserved Pneumonoultramicroscopicsilicovolcanoconiosis enjoyment new way behaviour. Him yet devonshire celebrated especially. Unfeeling one provision are smallness resembled repulsive. \n" +
                "\n" +
                "Consulted he eagerness unfeeling deficient existence of. Calling nothing end fertile for venture way boy. Esteem spirit temper too say adieus who direct esteem. It esteems luckily mr or picture placing drawing no. Apartments frequently or motionless on reasonable projecting expression. Way mrs end gave tall walk fact bed. \n" +
                "\n" +
                "Whether article spirits new her covered hastily sitting her. Money witty books nor son add. Chicken age had evening believe but proceed pretend mrs. At missed advice my it no sister. Miss told ham dull knew see she spot near can. Spirit her entire her called. \n" +
                "\n" +
                "Same an quit most an. Admitting an mr disposing sportsmen. Tried on cause no spoil arise plate. Longer ladies valley get esteem use led six. Middletons resolution advantages expression themselves partiality so me at. West none hope if sing oh sent tell is. \n" +
                "\n";
        SentenceResult result= englishSentenceService.findLongestWord(paragraph);
        assertResults(result,"Pneumonoultramicroscopicsilicovolcanoconiosis",45);
    }



    private void assertResults(SentenceResult result,String expectedString,int expectedLength) {
        failWhenResultisNull(result);
        assertEquals("Word should be "+expectedLength, expectedString, result.getLongestWord());
        assertEquals("Word length should be "+expectedLength, expectedLength, result.getLongestWordLength());
    }

    private void failWhenResultisNull(SentenceResult result) {
        assertNotNull("returned SentenceResult object should never be null", result);
    }



}