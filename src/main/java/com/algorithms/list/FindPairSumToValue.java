package com.algorithms.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *  Algorithm to find all pairs of integers within an array which sum to a specified value.
 * @author arunponnaiah
 *
 */
public class FindPairSumToValue {
	
	/**
	 * find pairs of integers that equals to supplied parameter "sum".
	 * @param array
	 * @param sum
	 * @return
	 */
	public List<int[]> findPairs(int[] array , int sum){
		List<int[]> output = new ArrayList<int[]>();
		
		Set<Integer> set = new HashSet<Integer>();
		for(Integer element : array ){
			set.add(element);
			
			int diff = sum - element;
			if(set.contains(diff))
				output.add(new int[]{element,diff});
		}
		
		return output;
	}
	
}
