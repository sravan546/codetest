package com.mastercard;

import com.mastercard.service.LongestWordResult;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AssertUtil {

    public static void assertResults(LongestWordResult result, String expectedString, int expectedLength) {
        failWhenResultisNull(result);
        assertEquals("Word should be "+expectedString, expectedString, result.getLongestWord());
        assertEquals("Word length should be "+expectedLength, expectedLength, result.getLongestWordLength());
    }

    public static void  failWhenResultisNull(LongestWordResult result) {
        assertNotNull("returned LongestWordResult object should never be null", result);
    }
}
