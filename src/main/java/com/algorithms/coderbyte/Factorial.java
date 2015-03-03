package com.algorithms.coderbyte;

public class Factorial {

	public int calculate(int num) {
		System.out.println(num);
	    if(num >1){
	    	return num*calculate(--num);
	    }
	  	return num;
	}

}
