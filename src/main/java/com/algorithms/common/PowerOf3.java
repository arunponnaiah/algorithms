package com.algorithms.common;

/**
 * Implement functions that calculates power(calc)
 * @author Arun
 *
 */

public class PowerOf3 {
	
	/**
	 * Check Integer is power of 3.
	 * @param num
	 * @return boolean
	 */

	public boolean checkByRecursion(int num) {
		int q = num/3;
		
		if(q==3){
			return true;
		}else if(q<3){
			return false;
		}else{
			return checkByRecursion(q);
		}
	}
	
	public boolean checkByLooping(int n){
		while(n%3==0){
			n/=3;
		}
		if(n==1){
			return true;
		}else{
			return false;
		}
	}
}
