package com.ps.java2novice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
	
	// O(n) time complexity
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

}
