package com.training.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.number.NumberTraining;

public class NumberTrainingTest {

	@Test
	public void testReverseInteger() {
		assertEquals(NumberTraining.reverseNumber(-1250), -521);
	}
	
	@Test
	public void testReverseDouble() {
		assertEquals(NumberTraining.reverseDouble(85.63), 36.58, 2);
	}

}
