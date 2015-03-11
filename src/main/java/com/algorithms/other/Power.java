package com.algorithms.other;

/**
 * Implement functions that calculates power(num,exp)
 * @author Arun
 *
 */

public class Power {
	
	/**
	 * power calculation by while loop
	 * Time complexity : O(exp)
	 * @param num
	 * @param exp
	 * @return
	 */

	public int calc(int num, int exp) {
			int power=1;
			while(exp >= 1){
				power*=num;
				exp--;
			}
			return power;
	}
	
	/**
	 * power calculation by recursion
	 * Time complexity : O(exp)
	 * @param num
	 * @param exp
	 * @return
	 */
	public int calcByRecursion(int num,int exp){
		if(exp==1){
			return num;
		}
		return num * calcByRecursion(num, --exp);
	}

}
