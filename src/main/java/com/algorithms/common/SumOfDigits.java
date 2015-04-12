package com.algorithms.common;

public class SumOfDigits {
	int sum=0;
	
	public int execute(int number){
		if(number!=0){
			 sum +=(number%10);
			 execute(number/10);
		}
		return sum;
	}

}
