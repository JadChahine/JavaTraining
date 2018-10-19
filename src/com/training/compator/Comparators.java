package com.training.compator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparators {

	public static void main(String[] args) {

		sortArray();
		sortList();
		//sortObjects();
		sortObjects2();
		
	}

	private static void sortArray() {
		String[] fruitsArray = new String[] { "Pineapple", "Apple", "Orange", "Banana" };

		Arrays.sort(fruitsArray);

		int i = 0;
		for (String temp : fruitsArray) {
			System.out.println("fruits " + ++i + " : " + temp);
		}
	}

	private static void sortList() {

		List<String> fruitsLst = new ArrayList<String>();

		fruitsLst.add("Pineapple");
		fruitsLst.add("Apple");
		fruitsLst.add("Orange");
		fruitsLst.add("Banana");

		Collections.sort(fruitsLst);

		int i = 0;

		for (String temp : fruitsLst) {
			System.out.println("fruits " + ++i + " : " + temp);
		}
	}

	private static void sortObjects() {
		Fruit[] fruits = new Fruit[4];

		Fruit pineappale = new Fruit("Pineapple", "Pineapple description", 70);
		Fruit apple = new Fruit("Apple", "Apple description", 100);
		Fruit orange = new Fruit("Orange", "Orange description", 80);
		Fruit banana = new Fruit("Banana", "Banana description", 90);

		fruits[0] = pineappale;
		fruits[1] = apple;
		fruits[2] = orange;
		fruits[3] = banana;

		Arrays.sort(fruits);

		int i = 0;
		for (Fruit temp : fruits) {
			System.out.println("fruits " + ++i + " : " + temp.getFruitName() + ", Quantity : " + temp.getQuantity());
		}
	}
	
	private static void sortObjects2() {
		FruitComparable[] fruits = new FruitComparable[4];

		FruitComparable pineappale = new FruitComparable("Pineapple", "Pineapple description", 70);
		FruitComparable apple = new FruitComparable("Apple", "Apple description", 100);
		FruitComparable orange = new FruitComparable("Orange", "Orange description", 80);
		FruitComparable banana = new FruitComparable("Banana", "Banana description", 90);

		fruits[0] = pineappale;
		fruits[1] = apple;
		fruits[2] = orange;
		fruits[3] = banana;

		Arrays.sort(fruits);

		int i = 0;
		for (FruitComparable temp : fruits) {
			System.out.println("fruits " + ++i + " : " + temp.getFruitName() + ", Quantity : " + temp.getQuantity());
		}
	}

}
