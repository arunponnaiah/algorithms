package com.algorithms.list;

/**
 * Finding peak element using binary search based divide & conquer paradigm.
 * It will be done in O(nlogn).
 * For eg : [1,3,5,2,6,7,10]
 * @author aponnaia
 *
 */
public class PeakFinder {

	public int find(int[] array){
		
		int start = 0;
		int end =array.length-1;
		
		return search(array,start,end);
	}


	private int search(int[] array, int start, int end) {
		int mid = (start+end )/ 2;
		
		if(mid-1 >= 0 &&  array[mid] < array[mid-1])
			return search(array,start,mid-1);
		else if( mid +1 <= array.length-1 && array[mid] < array[mid+1])
			return search(array,mid+1,end);
		else 
			return array[mid];
	}
}
