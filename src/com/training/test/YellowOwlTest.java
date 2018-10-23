package com.training.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.misc.YellowOwl;


public class YellowOwlTest {

	private final String[] words1 = new String[] { "3: yellow", " 7:the", " 2: little", "5 : fly", "9 :space", "11:the " };

    private static final String[] words2 = new String[] { "6    : over", "1 :  the  ", "8 : open", "10:during", "4:owl ", "12:  daily." };
    
    private final String expectedOutput = "the little yellow owl fly over the open space during the daily.";
    
	@Test
	public void test() {
		
		String sentence = YellowOwl.getSentenceOutput(words1, words2);
		
		assertEquals(expectedOutput, sentence);
	}

}
