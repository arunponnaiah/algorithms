package com.algorithms.common;

public class Factorial {

	public int calculate(int num) {
		System.out.println(num);
	    if(num >1){
	    	return num*calculate(--num);
	    }
	  	return num;
	}

}
