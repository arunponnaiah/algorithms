package com.algorithms.java2novice;

public class ArmstrongNumber {
	private int sum;
	public boolean check(int number){
		if(number!=0){
			sum +=Math.pow((number%10),3);
			int q = number/10;
			check(q);
		}
		return (sum == number)?true:false;
		}
}
