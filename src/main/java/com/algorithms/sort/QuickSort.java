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
	 * Recursive function to sort array elements.
	 * @param arr
	 * @param start
	 * @param end
	 * @return
	 */
	
	public static int[] sort(int[] arr){
		int start=0;
		int end =arr.length-1;
		return quickSort(arr, start, end);
	}
	
	
	
	private static int[] quickSort(int[] arr, int start, int end) {
		
		if(start <= end){
			int pIndex = partition(arr,start,end);
			swap(arr,pIndex,end);
			quickSort(arr,start,pIndex-1);
			quickSort(arr,pIndex+1,end);
		}
		
		return arr;
	}

	/**
	 * partition guarantees all left elements in array are less than pivot and all right elements are greater than pivot.
	 * Step1: take 1st element from array as pivot
	 * Step2: compare other elements to the pivot and swap them to the left of pivot if left < pivot  
	 * @param arr
	 * @param start
	 * @param end
	 * @return
	 */
	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int pIndex  = start;
		
		for(int i=start; i<end; i++){
			if(arr[i] < pivot){
				swap(arr,i,pIndex);
				pIndex++;
			}
		}
		
		return pIndex;
	}

	/**
	 * Swap 2 integers using temp variable.
	 * @param input
	 * @param i
	 * @param j
	 */
	private static void swap(int[] input, int src, int destn) {
		int temp = input[src];
		 input[src] =  input[destn];
		 input[destn] = temp;
	}
}

