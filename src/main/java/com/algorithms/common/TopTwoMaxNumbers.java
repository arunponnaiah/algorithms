package com.algorithms.common;

import java.util.Arrays;

public class TopTwoMaxNumbers {
	private int index;
	private int[] result;
	
	public TopTwoMaxNumbers() {
		this.result = new int[2];
	}
	
	/**
	 * Find top 2 max numbers in an array
	 * @param inputArr
	 * @return int[]
	 */
	public int[] find(int[] inputArr) {
		Arrays.sort(inputArr);
		int arrLen = inputArr.length;
		while(index <2){
			result[index] = inputArr[--arrLen];
			index++;
		}
		return result;
	}

}
