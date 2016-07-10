package com.algorithms.list;

import java.util.ArrayList;
import java.util.Collections;

public class MinimumDiffInList {
	public int get(ArrayList<Integer> input) {
		Collections.sort(input);
		int minDiff = input.get(1) - input.get(0);
		
		for(int i=2;i< input.size(); i++){
			minDiff = Math.min(minDiff, input.get(i) - input.get(i-1));
		}
		return minDiff;
	}
}
