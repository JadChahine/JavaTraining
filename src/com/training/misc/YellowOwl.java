package com.training.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class YellowOwl {
    
    private final String[] words1 = new String[] { "3: yellow", " 7:the", " 2: little", "5 : fly", "9 :space", "11:the " };

    private static final String[] words2 = new String[] { "6    : over", "1 :  the  ", "8 : open", "10:during", "4:owl ", "12:  daily." };

    /**
     * Prints out <br>
     * the little yellow owl fly over the open space during the daily.
     */
    public static void main(String [] args) {
    	String[] words1 = new YellowOwl().words1;
    	
    	Map<Integer, String> sentenceMap  = fillMapFromLists(words1, words2);
    	
    	/*
    	for (Map.Entry<Integer, String> sentenceMapItem : sentenceMap.entrySet()) {
			System.out.print(sentenceMapItem.getValue() + " ");
		}
		*/
    	
    	
    	//using java8
    	sentenceMap.forEach( (key, value) -> {
    		System.out.print(value + " ");
    	});
    	
        //System.out.println("Just Do It! =)");
    }
    
    /**
     * 
     * @param words1
     * @param words2
     * @return
     */
    public static String getSentenceOutput(String[] words1, String[] words2){
    	String sentenceResult = "";
    	
    	Map<Integer, String> sentenceMap  = fillMapFromLists(words1, words2);
    	
    	for (Map.Entry<Integer, String> sentenceMapItem : sentenceMap.entrySet()) {
    		sentenceResult += sentenceMapItem.getValue() + " ";
		}
    	
    	return sentenceResult.trim();
    }
    
    /**
     * Loop over the arrays and fill the map that already sorts the words by index
     * 
     * @param words1
     * @param words2
     */
    private static Map<Integer, String> fillMapFromLists(String[] words1, String[] words2){
    	
    	Map<Integer, String> sentenceMap = new TreeMap<>();
    	
    	List<String> sentenceWords = getSentenceWords(words1, words2);
    
    	sentenceWords.forEach( word -> {
    		String[] parts = word.split(":");
			sentenceMap.put(Integer.parseInt(parts[0].trim()), parts[1].trim());
    	});
    	
    	/*
    	Arrays.asList(words1).forEach( word -> {
    		String[] parts = word.split(":");
			sentenceMap.put(Integer.parseInt(parts[0].trim()), parts[1].trim());
    	});
    	
    	Arrays.asList(words2).forEach( word -> {
    		String[] parts = word.split(":");
			sentenceMap.put(Integer.parseInt(parts[0].trim()), parts[1].trim());
    	});
    	*/
    	
    	/*
    	for (String word : words1) {
			String[] parts = word.split(":");
			sentenceMap.put(Integer.parseInt(parts[0].trim()), parts[1].trim());
		}
    	
    	for (String word : words2) {
			String[] parts = word.split(":");
			sentenceMap.put(Integer.parseInt(parts[0].trim()), parts[1].trim());
		}
		*/
    	
    	return sentenceMap;
    }
    
    private static List<String> getSentenceWords(String[] words1, String[] words2){
    	List<String> sentenceWords = new ArrayList<>();
    	
    	sentenceWords.addAll(Arrays.asList(words1));
    	sentenceWords.addAll(Arrays.asList(words2));
    	
    	return sentenceWords;
    }
    
    
}