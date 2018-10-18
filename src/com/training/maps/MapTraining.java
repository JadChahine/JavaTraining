package com.training.maps;

import java.util.HashMap;
import java.util.Map;

public class MapTraining {
	
	public static Map<Integer, String> generateMap(){
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "First Item");
		map.put(2, "Second Item");
		map.put(3, "Third Item");
		map.put(4, "Fourth Item");
		
		return map;
	}
	
}

