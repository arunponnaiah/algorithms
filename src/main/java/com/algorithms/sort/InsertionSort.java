package com.algorithms.sort;

public class InsertionSort {
	/**
	 * Insertion Sorting using (while loop) subroutine:
	 * Forloop stmt proceed with next index in the array once while loop compares & swaps previous indexes.
	 * @param arr
	 * @return
	 */
	public int[] sort(int[] arr){
		for(int i=1; i<arr.length;i++){
			int currentIndex=i;
			int previousIndex=currentIndex-1;
			while( previousIndex >=0
					&& arr[previousIndex] > arr[currentIndex]){
				this.swap(arr, currentIndex, previousIndex);;
				--currentIndex;
				--previousIndex;
			}
		}
		
		return arr;
	}

	/**
	 * Swaps items with no temp variable
	 * @param arr
	 * @param currentIndex
	 * @param previousIndex
	 */
	private void swap(int[] arr , int currentIndex, int previousIndex) {
		arr[currentIndex] = arr[currentIndex] + arr[previousIndex];
		arr[previousIndex]  = arr[currentIndex] - arr[previousIndex];
		arr[currentIndex] = arr[currentIndex] - arr[previousIndex];
	}

}
