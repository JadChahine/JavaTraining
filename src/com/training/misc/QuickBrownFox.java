package com.training.misc;

import java.util.Map;
import java.util.TreeMap;

public class QuickBrownFox {
    
    private final String[] words1 = new String[] { "3: brown", " 7:the", " 2: quick", "5 : jumped", "9 :dog", "11:morning " };
    private static final String[] words2 = new String[] { "6    : over", "1 :the", "8 : lazy", "10:one", "4:fox " };

    /**
     * Prints out <br>
     * the quick brown fox jumped over the lazy dog one morning.
     */
    private static void printSentence(){
    	String [] words1 = new QuickBrownFox().words1;
    	
    	Map<Integer, String> map = new TreeMap<>();
    	
    	for(int x = 0 ; x < words1.length ; x++){
    		String[] parts = words1[x].split(":");
    		map.put(Integer.parseInt(parts[0].trim()), parts[1].trim() + " ");
    	}
    	
    	for(int x = 0 ; x < words2.length ; x++){
    		String[] parts = words2[x].split(":");
    		map.put(Integer.parseInt(parts[0].trim()), parts[1].trim() + " ");
    	}
    	
    	map.values().forEach(System.out::print);
    }
    
    
    public static void main(String [] args){
    	printSentence();
    }
    	
    
}