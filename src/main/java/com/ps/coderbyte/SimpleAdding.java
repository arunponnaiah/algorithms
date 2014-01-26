package com.ps.coderbyte;

public class SimpleAdding {

	public int add(int num) {
		// TODO Auto-generated method stub
		int result = 0;
		if(num!=0){
			result = num + add(--num);
		}
		return result;
	}
	
}
