package com.algorithms.list;

/**
 * Algorithm to find the smallest element in unsorted array 
 * @author aponnaia
 *
 */
public class FindSmallestElementUnSortedArray {
	
	public int find(int[] inputs){
		int min=inputs[0];
		
		for(int i=1;i<inputs.length;i++){
			if(min > inputs[i]){
				min = inputs[i];
			}
		}
		
		return min;
	}

}
