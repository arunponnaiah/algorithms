package com.algorithms.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Algorithm to return longest palindrome in a string.
 * @author aponnaia
 *
 */
public class Palindrome {
	
	/*
	 * Returns longest palindrome in a given string.
	 */
	public String longest(String str){
		
		Map<String, Integer> map = new HashMap<String,Integer>();
		
		for(int i=0 ; i<= str.length(); i++){
			for(int j=(i+2) ; j <= str.length();j++){
				String substring = str.substring(i,j);
				String reverseStr = new StringBuilder(substring).reverse().toString();
				if(substring.equals(reverseStr)){
					map.put(substring,substring.length());
				}
			}
		}
		
		List<Entry<String, Integer>> sortedMapList = this.sortMapByValue(map);
		return sortedMapList.get(0).getKey();
		
	}

	/*
	 * Converts to map to list to sort by value.
	 */
	private List<Entry<String, Integer>> sortMapByValue(Map<String, Integer> map) {
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(entrySet);
		
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		System.out.println(list);
		return list;
	}
}
