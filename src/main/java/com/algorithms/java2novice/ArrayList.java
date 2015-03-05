package com.algorithms.java2novice;

public class ArrayList {
	private Integer[] intArr;
	private int size;
	public ArrayList(){
		this(10);
	}
	
	public ArrayList(int capacity){
		if (capacity < 0)
			throw new IllegalArgumentException("Illegal Capacity: "+capacity);
		this.intArr = new Integer[capacity];
	}
	
	public void add(Integer i) {
		checkCapacity();
		intArr[this.size] = i;
		this.size++;
	}

	private void checkCapacity() {
		if(this.size > this.intArr.length )
			throw new IllegalArgumentException("Illegal Capacity: "+size);
	}

	public void remove(int index) {
	}

	public int size() {
		return size;
	}

	public Integer get(int i) {
		if(i > this.size)
			throw new IllegalArgumentException("Illegal Capacity: "+i);
		return this.intArr[i];
	}
	
	
	

}
