package com.training.compator;

public class FruitComparable implements Comparable<FruitComparable> {

	private String fruitName;
	private String fruitDesc;
	private int quantity;

	public FruitComparable(String fruitName, String fruitDesc, int quantity) {
			super();
			this.fruitName = fruitName;
			this.fruitDesc = fruitDesc;
			this.quantity = quantity;
		}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getFruitDesc() {
		return fruitDesc;
	}

	public void setFruitDesc(String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int compareTo(FruitComparable compareFruit) {

		int compareQuantity = compareFruit.getQuantity();

		// ascending order
		return this.quantity - compareQuantity;

		// descending order
		// return compareQuantity - this.quantity;

	}


}