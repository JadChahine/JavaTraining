package com.training.test;

import org.junit.Test;
import com.training.misc.RomanToInteger;

public class RomanToIntegerTest {

	@Test
	public void test() {
		String romanWord = "MCMXCIV";
		
		Integer number = RomanToInteger.romanToInt(romanWord);
		
		System.out.println("Romand Word '" + romanWord + "' => " + number);
	}
	

}
