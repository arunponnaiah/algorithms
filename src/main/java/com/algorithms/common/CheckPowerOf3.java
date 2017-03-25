package com.algorithms.common;

/**
 * Implement functions that calculates power(calc)
 * @author Arun
 *
 */

public class CheckPowerOf3 {
	
	/**
	 * Check Integer is power of 3.
	 * @param num
	 * @return boolean
	 */

	public boolean check(int num) {
		int q = num/3;
		
		if(q==3){
			return true;
		}else if(q<3){
			return false;
		}else{
			return check(q);
		}
	}
}
