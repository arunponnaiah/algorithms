package com.algorithms.search;

/** 
 * Boyers-Moore vote algorithm to find majority element in an array. 
 * @author aponnaia
 *
 */
public class MajorityElement {
	
	/**
	 * Use count variable to find most likely majority candidate. 
	 * @param input
	 * @return
	 */
	private static int findCandidate(int[] input){
		
		int count=0;
		int candidate =0;
		
		for(int i=0;i<input.length-1;i++){
			if(count == 0){
				candidate = input[i];
				count++;
			}else{
				if(candidate == input[i]){
					count++;
				}else{
					count--;
				}
			}
		}
		return candidate;
	}

/**
 * check if candidate is majority element using average array length.
 * @param input
 * @param candidate
 * @return
 */
	private static boolean checkMajorityElement(int[] input, int candidate) {
		int count=0;
		for(int element: input){
			if(candidate == element){
				count++;
			}
		}
		int avgArrayLength = input.length/2;
		if(count > avgArrayLength){
			return true;
		}
		return false;
	}
	
	/**
	 * Main function to find the majority element.
	 * Returns major element 
	 * Else returns -1
	 * @param input
	 * @return
	 */

	public static int search(int[] input){
		int candidate = findCandidate(input);
		boolean isMajorityElement = checkMajorityElement(input,candidate);
		if(isMajorityElement){
			return candidate;
		}
		return -1;
	}
}
