package com.ps.mock;

import java.util.Comparator;

public class Fruit implements Comparable<Fruit> {
	private String name;
	private int quantity;
	
	@Override
	public int compareTo(Fruit fruit) {
		System.out.println("comparable executed");
		int quantity = fruit.getQuantity(); 
		if(this.quantity > quantity) return 1;
		if(this.quantity < quantity) return -1;
		return 0;
	}

	
	public static Comparator<Fruit> FruitNameComparator 
		    = new Comparator<Fruit>() {
		
		public int compare(Fruit fruit1, Fruit fruit2) {
		System.out.println("comparator executed");
		String fruitName1 = fruit1.getName().toUpperCase();
		String fruitName2 = fruit2.getName().toUpperCase();
		
			//ascending order
			return fruitName1.compareTo(fruitName2);
			
			//descending order
//			return fruitName2.compareTo(fruitName1);
			}
		
		};
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
}
