package com.training.maps;

import java.util.HashMap;
import java.util.Map;

public class MapTraining {

	public static void main(String [] args){
		Map<Integer, String> map = generateMap();
		printMap(map);
	}
	
	private static Map<Integer, String> generateMap(){
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "First Item");
		map.put(2, "Second Item");
		map.put(3, "Third Item");
		map.put(4, "Fourth Item");
		
		
		return map;
	}
	
	private static void printMap(Map<Integer, String> map){
		
		for(Map.Entry<Integer, String> mapEntry : map.entrySet()){
			System.out.println( "Key: '" + mapEntry.getKey() + "', value: '" + mapEntry.getValue() + "' ");
		}
		
		map.forEach( (key, value) -> {
			System.out.println( "Key: '" + key + "', value: '" + value + "' ");
		});
	}
	
}

