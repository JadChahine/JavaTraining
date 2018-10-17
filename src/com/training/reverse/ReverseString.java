package com.training.reverse;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {
	
	public static void main(String [] args){
		System.out.println(reverseString("jadchahine"));
		System.out.println(reverseStringJava8("jadchahine"));
		
	}
	
	private static String reverseString(String s){
		String reverse = "";
		
		for(int i = s.length() - 1; i >= 0 ; i--){
			reverse += s.charAt(i);
		}
		
		return reverse;
	}
	
	private static String reverseStringJava8(String s){
		String reverse = Arrays.asList(s).stream().map(x -> new StringBuilder(x).reverse().toString()).collect(Collectors.toList()).get(0);
		
		return reverse;
	}
	
}
