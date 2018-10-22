package com.training.misc;

import java.util.HashMap;
import java.util.Map;

public class FirstAssignment {

	
	/**
	 * 1. Write a program that prints the numbers from 1 to 100. 
		But for multiples of three print “Bat” instead of the number and for the multiples of five print “Man”. 
		For numbers which are multiples of both three and five print “BatMan”.
		2. Modify the program to take the upper range number as integer argument from command line.
		3. Write a JUnit that test the function.
	 */
	public static void printNumbers(int upperRange){
		
		for(int i = 1 ; i <= upperRange; i++){
			String stringToPrint = String.valueOf(i);
			
			Boolean multipleOfThree = false;
			Boolean multipleOfFive = false;
			
			if(i % 3 == 0){
				multipleOfThree = true;
				stringToPrint = "Bat";
			}
			else if(i % 5 == 0){
				multipleOfFive = true;
				stringToPrint = "Man";
			}
			
			if(multipleOfThree && multipleOfFive){
				stringToPrint  = "BatMan";
			}
			
			printOnScreen(i, stringToPrint);
		}
		
	}
	
	public static Map<Integer, String> fillNumbersUsingMap(int upperRange){
		Map<Integer, String> map = new HashMap<>();
		
		String stringToPrint = null;
		
		for(int i = 1 ; i <= upperRange; i++){
			stringToPrint = String.valueOf(i);
			
			if(i % 3 == 0 && i % 5 == 0){
				stringToPrint = "BatMan";
			}
			else if(i % 3 == 0){
				stringToPrint = "Bat";
			}
			else if(i % 5 == 0){
				stringToPrint = "Man";
			}
			
			map.put(i, stringToPrint);
		}
		
		return map;
	}
	
	
	private static void printOnScreen(int index, String x){
		System.out.println("Index '" + index + "' => " + x);
	}
	
	
	
}
