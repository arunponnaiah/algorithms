package com.algorithms.java2novice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CommonElementsInArray {
	private int[] firstArray;
	private int[] secondArray;
	private Map<Integer, Boolean> map;

	public CommonElementsInArray(int[] firstArray, int[] secondArray) {
		this.firstArray = firstArray;
		this.secondArray = secondArray;
		this.map = new HashMap<Integer, Boolean>();
	}

	/**
	 * Find common elements between 2 arrays
	 * @return
	 */
	public Set<Integer> findCommonElements() {
		Set<Integer> commonElements = new HashSet<Integer>();
		init(firstArray);
		for(int i : secondArray){
			Boolean element = map.get(i);
			if(element != null && element.equals(Boolean.TRUE)){
				commonElements.add(i);
			}
		}
		return commonElements;
	}

	private void init(int[] arr) {
		for(int i : arr){
			this.map.put(i, true);
		}
	}
	
	

}
