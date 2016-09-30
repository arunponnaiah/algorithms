package com.algorithms.sort;

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
public int[] sort(int[] input){
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
	if(start  < end){
		int partitionIndex = partition(input,start,end);
		sort(input,start,partitionIndex-1);
		sort(input,partitionIndex+1,end);
	}
	return input;
}

/**
 * partition guarantees all left elements in array are less than pivot and all right elements are greater than pivot.
 * Step1: take 1st element from array as pivot
 * Step2: compare other elements to the pivot and swap them to the left of pivot if left < pivot  
 * @param input
 * @param start
 * @param end
 * @param pivot
 * @return
 */
private int partition(int[] input,int start,int end) {
	int pivotIndex = start;
	int pivot = input[start];
	int left =start+1;
	int right = end;
	
	while( true ){
		while(left <= right){
			if(input[left] < pivot){
				left++;
			}else{
				break;
			}
		}

		while(right > left){
			if(input[right] > pivot){
				right--;
			}else{
				break;
			}
		}

		if(left >= right){
			break;
		}
		swap(input,left,right);
		left++;
		right--;
	}
	swap(input,left-1,pivotIndex);
	
	return left-1;
}

/**
 * Swap 2 integers using temp variable.
 * @param input
 * @param i
 * @param j
 */
private void swap(int[] input, int src, int destn) {
	int temp = input[src];
	 input[src] =  input[destn];
	 input[destn] = temp;
}

}
