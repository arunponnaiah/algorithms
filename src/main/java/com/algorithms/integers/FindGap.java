package com.algorithms.integers;

/**
 * Given a sorted array of unique integers between 0 and 99 (inclusive), 
 * write a function which returns a string summarizing any gaps in the array.
 * Gaps should be separated by a comma and space.
 * Missing ranges should be summarized by the first number of the range, then a hyphen, then the last number of the range.
 * 
 * Example:
 * INPUT:  int[](3, 4, 5, 6, 50, 51, 53, 76)
 * OUTPUT: “0-2, 7-49, 52, 54-75, 77-99”
 * @author arunponnaiah
 *
 */
public class FindGap {
	
	/**
	 * Main function to take sorted integer array and returns String.
	 * @param input
	 * @return
	 */
	public String summarizeGaps(int[] arr) {
		int min=0;
		int max=0;
		StringBuilder strBuilder = new StringBuilder();
		
		//edge case
		if(arr[0] > 0){
			min =0;
			max=arr[0]-1;
		}
		
		strBuilder.append(min+"-"+max).append(", ");
		
		for(int i=0,j=i+1; i<arr.length-1;i++,j++){
			 min = arr[i];
			 max = arr[j];
			 int diff = max-min;
			 if(diff ==2){
				 strBuilder.append(min+1).append(", ");
			 }
			 else if(diff > 2){
				 min = min+1;
				 max = min+(diff-2);
				 strBuilder.append(min+"-"+max).append(", ");
			 }
			
			 
		}
		
		//edge case
		if(arr[arr.length-1] <99){
			int diff = 99-arr[arr.length-1];
			min =arr[arr.length-1]+1;
			max=(arr[arr.length-1]+1) + (diff-1);
		}
		
		strBuilder.append(min+"-"+max);
		return strBuilder.toString();
	}
}
