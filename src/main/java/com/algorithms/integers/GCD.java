package com.algorithms.integers;

import java.util.List;

/**
 * Euclid's algorithm to find greater common divisor from set of numbers.
 * @author arunponnaiah
 *
 */
public class GCD {
	
	public static int calculate(List<Integer> list){
		int gcd = list.get(0);
		 
		for(int i = 1; i < list.size(); i++) {
			gcd = find(gcd, list.get(i));
		}
	    return gcd;
	}
	
	private static int find(int a , int b){
		//swap numbers if dividend(a) is smaller than divisor(b).
		if(a < b){
			a = a+b; 
			b= a-b;
			a = a-b;
		}
		//find GCD between 2 numbers through iteration
		while(b>0){
			int reminder = a%b;
			a=b;
			b = reminder;
		}
		return a;
	}
}
