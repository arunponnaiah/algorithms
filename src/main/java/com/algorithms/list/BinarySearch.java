package com.algorithms.list;

import java.util.Arrays;

/**
 * Binary algorithm using divide and conquer approach.
 * @author aponnaia
 *
 */
public class BinarySearch {
	
	/**
	 * Main method for clients to search an element in array.
	 * @param inputs
	 * @param valueToFind
	 * @return
	 */

	public boolean isExist(int[] inputs,int valueToFind){
		Arrays.sort(inputs);
		int start=0;
		int end = inputs.length-1;
		return find(inputs,valueToFind,start,end);
	}

	/**
	 * Function gets called recrusively until finds the element.
	 * @param inputs
	 * @param valueToFind
	 * @param start
	 * @param end
	 * @return
	 */
	private boolean find(int[] inputs,int valueToFind,  int start, int end) {
		int mid = (start+end)/2;
		
		if( start <= end){
			if(valueToFind < inputs[mid]){
				return find(inputs,valueToFind,0,mid-1);
			}else if(valueToFind > inputs[mid]){
				return find(inputs,valueToFind,mid+1,end);
			}else if(inputs[mid] == valueToFind){
				return true;
			}
		}
		return false;
	}
}
