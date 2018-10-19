package com.training.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.training.string.StringTraining;

public class StringTrainingTest {

	@Test
	public void test() {
		String stringToReverse = "jadchahine";
		String expectedString = "enihahcdaj";
		System.out.println("Expected Reverse => '" + expectedString + "'");
		
		String reverse = StringTraining.reverseString(stringToReverse);
		System.out.println("Reverse => '" + reverse + "'");
		assertEquals(expectedString, reverse);
		
		String reverseUsingList = StringTraining.reverseStringUsingList(stringToReverse);
		System.out.println("Reverse using List => '" + reverseUsingList + "'");
		assertEquals(expectedString, reverseUsingList);
		
		String reverseUsingStringBuffer = StringTraining.reverseStringUsingStringBuffer(stringToReverse);
		System.out.println("Reverse using StringBuffer => '" + reverseUsingStringBuffer + "'");
		assertEquals(expectedString, reverseUsingStringBuffer);
		
	}

}
