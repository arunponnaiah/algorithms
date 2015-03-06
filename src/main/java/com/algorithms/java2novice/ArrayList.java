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
	
	public boolean add(Integer i) {
		checkCapacity();
		intArr[this.size] = i;
		this.size++;
		return true;
	}

	private void checkCapacity() {
		if(this.size > this.intArr.length )
			throw new IllegalArgumentException("Illegal Capacity: "+size);
	}

    // TODO
	public void remove(int index) {
	}

	public int size() {
		return this.size;
	}

	public Integer get(int i) {
		if(i > this.size)
			throw new IllegalArgumentException("Illegal Capacity: "+i);
		return this.intArr[i];
	}
	
	public boolean isEmpty(){
		return (this.size==0)?true:false;
	}

	//TODO
	public boolean contains(int i) {

		return false;
	}
}
