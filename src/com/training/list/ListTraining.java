package com.training.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ListTraining {

	//Public Methods
	
	/**
	 * Find out duplicate number in given list
	 * 
	 * @param lst
	 * @return
	 */
	public static List<Integer> getDuplicatesLst(List<Integer> lst){
		Map<Integer, Integer> map = fillListInMap(lst);
		
		printMap(map);
		
		return getDuplicatesLstFromMap(map);
	}

	
	
	//Private Methods
	private static List<Integer> getDuplicatesLstFromMap(Map<Integer, Integer> map){
		List<Integer> lstDuplicates = new ArrayList<>();
		
		for(Entry<Integer, Integer> entry : map.entrySet()){
			if(entry.getValue() > 1){
				lstDuplicates.add(entry.getKey());
			}
		}
	
		return lstDuplicates;
	}
	
	private static Map<Integer, Integer> fillListInMap(List<Integer> lst){
		Map<Integer, Integer> map = new HashMap<>();
		
		for(Integer nb : lst){
			if(map.get(nb) == null){
				map.put(nb, 1);
			}
			else{
				map.put(nb, map.get(nb) + 1);
			}
		}
		
		return map;
	}
	
	private static void printMap(Map<Integer, Integer> map){
		for(Entry<Integer, Integer> entry : map.entrySet()){
			System.out.print(entry.getKey() + "/" + entry.getValue() + " ");
		}
		System.out.println();
	}
	
	
}
