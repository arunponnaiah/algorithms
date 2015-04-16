package com.algorithms.common;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
/**
 * Returns an asecdending ordered sorted array with distinct elements ( with no duplicates) using sorting 
 * 
 * @author aponnaiah
 *
 */

public class DistinctElements {
	public int[] find(int[] arr){
		/**
		 * TreeSet - Guarantees sorted set with distinct elements
		 */
		Set<Integer> set = new TreeSet<Integer>();
		
		/*
		 * copy arr to set
		 */
		for(int i=0;i<arr.length;i++){
			set.add(arr[i]);
		}
		
		/*
		 * copy arr to set
		 */
		int[] distinctArr = new int[set.size()];
		int index=0;
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()){
			distinctArr[index] = iter.next();
			index++;
		}
		
		return distinctArr;
	}

}
