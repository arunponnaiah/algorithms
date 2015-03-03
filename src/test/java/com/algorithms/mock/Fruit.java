package com.algorithms.mock;

import java.util.Arrays;


public class Fruit implements Comparable<Fruit>{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Fruit fruit1 = new Fruit();
		fruit1.setName("Arun");
		
		Fruit fruit2 = new Fruit();
		fruit2.setName("Akhil");
		
		Fruit fruit3 = new Fruit();
		fruit3.setName("Anu");
		
		Fruit[] fruits = new Fruit[]{fruit1,fruit2,fruit3};
		Arrays.sort(fruits);
		
		for(Fruit fruit : fruits){
			System.out.println(fruit.getName());
		}
		
	}

	public int compareTo(Fruit fruit) {
		System.out.println("compareTo >> " + fruit.getName());
		if(this.getName().length() > fruit.getName().length()  )
			return 1;
		else
			return -1;	
	}
	
	
}