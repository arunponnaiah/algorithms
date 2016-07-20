package com.algorithms.list;

/**
 * Finding peak element using binary search based divide & conquer paradigm.
 * It will be done in O(nlogn).
 * For eg : [1,3,5,2,6,7,10]
 * @author aponnaia
 *
 */
public class PeakFinder {
	public int find(int[] input){
	
		// left corner elements 
		if(input[0] > input[1] || input[0] == input[1]){
			return input[0];
		}
		
		// right corner elements 
		if(input[input.length-1] > input[input.length-2]
						|| input[input.length-1] == input[input.length-2]){
			return input[input.length-1];
		}
		
		int low =0;
		int high = input.length-1;
		int mid = (low+high)/2;
		
		return search(input, low , mid , high);	
	}

	private int search(int[] input, int low, int mid , int high) {
	
		// return peak element if mid is greater than or equal to both sides
		if(input[mid] > input[mid-1]  && input[mid] > input[mid+1] ||
				input[mid] == input[mid-1] &&  input[mid] == input[mid+1]){
			return input[mid];
		}
		
		if(mid > 0 &&  input[mid] < input[mid-1] ){
			mid = mid-1;
		}else if(mid < input.length-1 &&  input[mid] < input[mid+1]){
			mid = mid+1;
		}
		return search(input, low, mid, high);
	}
}
