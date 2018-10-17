package com.training.reverse;

public class ReverseArray {

	public static void main(String [] args){
		int[] arrToReverse = { 15, 18, 6, 4, 19};
		printArray(arrToReverse);
		
		int[] arr = reverseArray(arrToReverse);
		printArray(arr);
	}
	
	public static int[] reverseArray(int[] arrToReverse){
		int[] arr = arrToReverse.clone();
		
		for(int i = 0 ; i < arr.length/2 ; i++){
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		
		return arr;
	}
	
	public static void printArray(int[] arr){
		//Arrays.asList(arr).forEach(System.out::println);
		
		for(int arrItem : arr){
			System.out.print(arrItem + " ");
		}
		
		System.out.println();
	}
	
}
