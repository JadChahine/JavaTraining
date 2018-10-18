package com.training.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.array.ArrayTraining;

public class ArrayTrainingTest {

	@Test
	public void testReverseArray() {
		int[] arr = new int[] { 12, -98, 180, 657 };
		System.out.print("Array => ");
		printArray(arr);
		
		int[] expectedReverse = new int[]{ 657, 180, -98, 12 };
		System.out.print("Expected Reverse => ");
		printArray(expectedReverse);
		
		int[] reverse = ArrayTraining.reverseArray(arr);
		System.out.print("Reverse => ");
		printArray(reverse);
		
		assertArrayEquals(reverse, expectedReverse);
	}

	private void printArray(int[] arr){
		//Arrays.asList(arr).forEach(System.out::println);
		
		for(int arrItem : arr){
			System.out.print(arrItem + " ");
		}
		
		System.out.println();
	}
	
}
