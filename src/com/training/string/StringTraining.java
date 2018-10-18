package com.training.string;


public class StringTraining {
	
	public static String reverseString(String s){
		String reverse = "";
		
		for(int i = s.length() - 1; i >= 0 ; i--){
			reverse += s.charAt(i);
		}
		
		return reverse;
	}
	
	public static String reverseStringJava8(String s){
		//String reverse = Arrays.asList(s).stream().map(x -> new StringBuilder(x).reverse().toString()).collect(Collectors.toList()).get(0);
		
		String reverse = new StringBuilder(s).reverse().toString();
		
		return reverse;
	}
	
}
