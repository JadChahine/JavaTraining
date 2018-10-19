package com.training.misc;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	/**
	 * 
	 * @param s
	 * @return
	 */
	public static int romanToInt(String s){
		Map<String, Integer>  map = fillRomandWordsMap();
		
		int totalNumber = 0;
		
		String[] arr = s.split("");
		
		for(int index = 0 ; index < arr.length; index++){
			int number = 0;
			boolean valueCounted = false;
			String romanCharacter = arr[index];
			
			int currentValue = getKeyFromRomanWordsMap(romanCharacter, map);
			
			if(currentValue != 0){
				if(index < arr.length  - 1){
					
					String nextRomanCharacter = arr[index + 1];
					
					int nextValue = getKeyFromRomanWordsMap(nextRomanCharacter, map);
					
					if(nextValue > 0 && currentValue < nextValue){
						number = nextValue - currentValue;
						index++;
						valueCounted = true;
					}
				}
				
				if(!valueCounted){
					number = currentValue;
				}
			}
			
			totalNumber += number;
		}
		
		return totalNumber;
	}
	
	/**
	 * 
	 * @return
	 */
	@SuppressWarnings("serial")
	private static Map<String, Integer> fillRomandWordsMap(){
		 return new HashMap<String, Integer>(){
			{
				put("I", 1);
				put("V", 5);
				put("X", 10);
				put("L", 50);
				put("C", 100);
				put("D", 500);
				put("M", 1000);
			}
		};
	}
	
	/**
	 * 
	 * @param romanCharacter
	 * @param map
	 * @return
	 */
	private static int getKeyFromRomanWordsMap(String romanCharacter, Map<String, Integer> map){
		int value = 0;
		
		try{
			value = map.get(romanCharacter);
		}
		catch(Exception ex){
			System.out.println("Failed to get key '" + romanCharacter + "' from map due to " + ex.getMessage());
		}
		
		return value;
	}
	
}
