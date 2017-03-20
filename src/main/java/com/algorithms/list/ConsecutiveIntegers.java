package com.algorithms.list;

import java.util.HashSet;
import java.util.Set;

/**
 * Find the 3 or more consecutive array of integers from given sorted array
 */
public class ConsecutiveIntegers {
	public Set<Integer> find(int[] arr){
		
		int arrLen = arr.length;
		
		Set<Integer> set = new HashSet<Integer>();
		int count=0;
		for(int i =0 ;i < (arrLen-1); i++){
			for(int j=(i+1); j < arrLen; j++){
			
				if(arr[i]==arr[j]){
					count++;
					if(count >= 3)
						set.add(arr[i]);
				}else
					count=0;
			}
		}
		return set;
	}
}
