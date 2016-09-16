package com.algorithms.sorting;


/**
* QuickSort is an in-place sorting algorithm to sort an input with out using extra space.
* 
* Worst case time complexity: 0(n^2)
* Avg time complexity: O(nlogn)
* 
* @author aponnaia
*/
public class QuickSort {

/**
 * High level function to call sort array recursively.
 * @param input
 * @return
 */
public int[] sortNumbers(int[] input){
	int start=0;
	int end =input.length-1;
	return sort(input,start,end);
}

/**
 * Recursive function to sort array elements.
 * @param input
 * @param start
 * @param end
 * @return
 */
private int[] sort(int[] input, int start, int end) {
	if(start < end){
		int pivotIndex = partitionByPivot(input,start,end);
		sort(input, start, pivotIndex-1);
		sort(input, pivotIndex+1, end);
	}
	return input;
}

/**
 * partition guarantees all left elements in array are less than pivot and all right elements are greater than pivot.
 * @param input
 * @param start
 * @param end
 * @param pivot
 * @return
 */
private int partitionByPivot(int[] input, int start, int end) {
	int pivot = input[input.length-1];
	
	while(start < end){
		while (input[start] < pivot ){
			start++;
		}
		while (input[end] > pivot ){
			end--;
		}
		swap(input,start,end);
	}
	
	return getPivotIndex(input,pivot);
}


	/**
	 * Returns array index of pivot element. 
	 * @param input
	 * @param pivot
	 * @return
	 */
	private int getPivotIndex(int[] input,int pivot) {
		int pivotIndex=-1;
		for(int val : input){
			pivotIndex++;
			if(val == pivot){
				return pivotIndex;
			}
		}
		return -1;
	}

	/**
	 * Swap 2 integers using temp variable.
	 * @param input
	 * @param i
	 * @param j
	 */
	private void swap(int[] input, int i, int j) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
}
