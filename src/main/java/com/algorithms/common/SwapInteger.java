package com.algorithms.common;

public class SwapInteger {
	
	/**
	 * Swap numbers with no temp variable.
	 * @param i
	 * @param j
	 * @return
	 */

	public int[] swap(int i, int j) {
			i = i+j;
			j= i-j;
			i=i-j;
		return new int[]{i,j};
	}

}
