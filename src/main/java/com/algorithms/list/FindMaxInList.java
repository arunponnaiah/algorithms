package com.algorithms.list;

import java.util.ArrayList;
import java.util.Collections;

public class FindMaxInList {

		public int get(ArrayList<Integer> input) {
			 //sort
	        Collections.sort(input);
	        System.out.println(input);
	        int index = input.size()-1;
	        //System.out.println(" index : "+ (index) +" last element : "+ input.get(input.size()-1));
	        return input.get(input.size()-1);
		}
		
		
}
