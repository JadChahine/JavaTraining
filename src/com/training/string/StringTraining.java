package com.training.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringTraining {
	
	public static String reverseString(String s){
		String reverse = "";
		
		for(int i = s.length() - 1; i >= 0 ; i--){
			reverse += s.charAt(i);
		}
		
		return reverse;
	}
	
	public static String reverseStringUsingList(String s){
		String[] arr = s.split("");
		
		List<String> lst = Arrays.asList(arr);
		
		Collections.reverse(lst);
		
		String reverse = String.join("", lst);
		
		return reverse;
	}
	
	public static String reverseStringUsingStringBuffer(String s){
		//String reverse = Arrays.asList(s).stream().map(x -> new StringBuilder(x).reverse().toString()).collect(Collectors.toList()).get(0);
		
		String reverse = new StringBuilder(s).reverse().toString();
		
		return reverse;
	}
	
}
