package com.algorithms.list;

import java.util.ArrayList;
import java.util.Collections;

public class FindMaxInList {

		public int get(ArrayList<Integer> input) {
	        Collections.sort(input);
	        return input.get(input.size()-1);
		}
		
		
}
