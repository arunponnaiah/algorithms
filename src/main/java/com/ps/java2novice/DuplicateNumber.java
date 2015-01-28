package com.ps.java2novice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
	/*
	 * Find duplicate numbers in a integer array using sorting strategy 
	 * Time complexity - O(n)
	 */
		public Set<Integer> findBySorting(int[] inputArr){
			Set<Integer> set = new HashSet<Integer>();
			
			Arrays.sort(inputArr);
			for(int i=1;i<inputArr.length;i++){
				int current = inputArr[i];
				int previousIndex = (i-1);
				int previous = inputArr[previousIndex];
				if(current == previous)
					set.add(current);
			}
			return set;
		}
		
		
		/*
		 * Find duplicate numbers in a integer array using brute force strategy 
		 * Time complexity - O(n)
		 */
		// O(n^2) time complexity
		public Set<Integer> findByBruteForce(int[] inputArr){
			Set<Integer> set = new HashSet<Integer>();
			for(int i=0;i<inputArr.length;i++){
				for(int j=i+1;j<inputArr.length;j++){
					if(inputArr[i]==inputArr[j]){
						set.add(inputArr[i]);
					}
				}	
			}
			return set;
		}

		/*
		 * Find a duplicate number in a sorted array with in range from 1 to 5
		 */
		public int findWithinRange(int[] inputArr) {
			int uniqueTotal=0;
			int val=1;
			int index=0;
			while(index <5){
				uniqueTotal = uniqueTotal+val;
				val++;
				index++;
			}
			
			int actualTotal=0;
			for(int i : inputArr){
				actualTotal = actualTotal +i;
			}
			return actualTotal - uniqueTotal;
		}
		
		

}
