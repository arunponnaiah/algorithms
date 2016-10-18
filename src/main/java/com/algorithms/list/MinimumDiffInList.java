package com.algorithms.list;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Find minimum difference between elements with in list.
 * @author arunponnaiah
 *
 */
public class MinimumDiffInList {
	
	/**
	 * Calculate minimum difference using sorting.
	 * @param input
	 * @return int
	 */
	public int get(ArrayList<Integer> input) {
		Collections.sort(input);
		int minDiff = input.get(1) - input.get(0);
		
		for(int i=2;i< input.size()-1; i++){
			int diff = input.get(i+1) - input.get(i);
			minDiff = Math.min(minDiff, diff);
		}
		return minDiff;
	}
}
