package com.training.test;

import java.util.Map;
import org.junit.Test;
import com.training.maps.MapTraining;

public class MapTrainingTest {

	@Test
	public void test() {
		Map<Integer, String> map = MapTraining.generateMap();
		
		for(Map.Entry<Integer, String> mapEntry : map.entrySet()){
			System.out.println( "Key: '" + mapEntry.getKey() + "', value: '" + mapEntry.getValue() + "' ");
		}
		
		map.forEach( (key, value) -> {
			System.out.println( "Key: '" + key + "', value: '" + value + "' ");
		});
	}

}
