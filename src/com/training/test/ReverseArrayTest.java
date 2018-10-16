package com.training.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.reverse.ReverseArray;

public class ReverseArrayTest {

	@Test
	public void testReverseArray() {
		assertArrayEquals( ReverseArray.reverseArray( new int[] { 12, -98, 180, 657 }), new int[]{ 657, 180, -98, 12 });
	}

}
