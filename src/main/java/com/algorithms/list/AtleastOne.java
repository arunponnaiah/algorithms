package com.algorithms.list;
/**
 * Find number which occurs only once in integer array using XOR operator
 * @author aponnaia
 *
 */
public class AtleastOne {
	public int find(int[] intArr){
		int result = 0;
		for(int i : intArr){
		  result ^= i;
		}
		return result;
	}
}
