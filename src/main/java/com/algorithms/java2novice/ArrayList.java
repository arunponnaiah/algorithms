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
		if(checkCapacity()){
			intArr[this.size] = i;
			this.size++;
		}else{
			Integer[] dest= new Integer[this.size+10]; 
			System.arraycopy(intArr, 0, dest, 0, this.size);
		}
		return true;
		
	}

	private boolean checkCapacity() {
		if(this.size >= this.intArr.length )
			return false;
		return true;
	}

	public boolean remove(Integer obj) {
		boolean isDuplicate=false;
		
		if(contains(obj)){
			
			Integer[] dest= new Integer[--this.size];
			int index=0;
			for(int i =0;i<this.size; i++){
				System.out.println(i);
				if(this.intArr[i].equals(obj) && !isDuplicate){
					isDuplicate=true;
					continue;
				}
				else{
					dest[index] = this.intArr[i];
					index++;
				}
			}
		}
		return true;
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

	public boolean contains(Integer obj) {
		for(int i =0;i<this.size; i++){
			if(obj.equals(this.intArr[i])){ 
				return true;
			}
		}
		return false;
	}
}
