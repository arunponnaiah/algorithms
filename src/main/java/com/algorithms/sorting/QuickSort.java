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
	int index = partitionByPivot(input,start,end);
	
	if (start < index - 1)
		sort(input, start, index - 1);
	if (index < end)
        sort(input, index, end);
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
	int pivotIndex = (start + end)/2;
	
	int pivot = input[pivotIndex];
	int lowerIndex=start;
	int higherIndex=end;
	
	while(lowerIndex <= higherIndex){
		while (input[lowerIndex] < pivot ){
			lowerIndex++;
		}
		while (input[higherIndex] > pivot ){
			higherIndex--;
		}
		swap(input,lowerIndex,higherIndex);
		lowerIndex++;
		higherIndex--;
	}
	return lowerIndex;
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
