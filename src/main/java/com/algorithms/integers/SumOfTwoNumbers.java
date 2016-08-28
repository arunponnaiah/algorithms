package com.algorithms.integers;

/**
 * Algorithm to sum two integers with out arithmetic operator (+).
 * @author aponnaia
 *
 */
public class SumOfTwoNumbers {
	
	public static int sum(int a ,int b){
		if(b==0)
			return a;
		int carry = (a & b); 
		a = a ^ b; 
		b = carry << 1; 
		return sum(a,b);
	}
}
