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
		
		String reverseJava8 = StringTraining.reverseStringJava8(stringToReverse);
		System.out.println("Reverse in Java 8 => '" + reverseJava8 + "'");
		assertEquals(expectedString, reverseJava8);
	}

}
