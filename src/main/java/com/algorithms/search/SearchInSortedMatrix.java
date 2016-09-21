package com.algorithms.search;

/**
 * Stair Search algorithm to search an element in 2D integer array.
 * @author aponnaia
 *
 */
public class SearchInSortedMatrix {

	/**
	 * Search element in 2D array using iterations.
	 * @param matrix
	 * @param element
	 * @return
	 */
	public boolean search(int[][] matrix,int element){
		int r=0;
		int c=matrix.length-1;
		
		if(element < matrix[0][0] 
				|| element > matrix[matrix.length-1][matrix.length-1]){
			return false;
		}
		
		while(r < matrix.length-1 && c >=0){
			if(matrix[r][c] <element)
				r++;
			else if(matrix[r][c] > element)
				c--;
			else 
				return true;
		}
		
		return false;
	}
}
