package com.algorithms.integer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Find the 3 or more consecutive array of integers from given sorted array
 */
public class ConsecutiveIntegers {
	public List<Integer> find(int[] arr){
		
		int arrLen = arr.length;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i =0 ;i < (arrLen-1); i++){
			for(int j=(i+1); j < arrLen; j++){
				if(arr[i]==arr[j]){
					if(map.containsKey(arr[i])){
						int count = map.get(arr[i]);
						map.put(arr[i], (count+1));
					}
					else{
						map.put(arr[i], 1);
					}
				}
			}
		}
		
		Set<Integer> keys = map.keySet();
		List<Integer> result = new ArrayList<Integer>();
		for(Integer key : keys){
			if( map.get(key) > 2){
				result.add(key);
			}
		}
		return result;
	}
}
