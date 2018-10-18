package com.training.array;

public class ArrayTraining {

	/**
	 * Reverse the passed array
	 * 
	 * @param arrToReverse
	 * @return
	 */
	public static int[] reverseArray(int[] arrToReverse){
		int[] arr = arrToReverse.clone();
		
		for(int i = 0 ; i < arr.length/2 ; i++){
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		
		return arr;
	}
	
}
