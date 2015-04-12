package com.algorithms.common;

public class SimpleAdding {
	public int add(int num) {
		if(num==0){
			return num;
		}
		return num + add(--num);
	}
	
}
