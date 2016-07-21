package com.algorithms.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NonRecuringElementInList {
	public int get(ArrayList<Integer> input) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int nonRecuringElement = 0;
		for(int element : input){
			if(map.get(element) != null){
				int count = map.get(element);
				count++;
				map.put(element, count);
			}
			else{
				map.put(element, 1);
			}
		}
		
		Set<Integer> set = map.keySet();
		for(int key:set){
			if(map.get(key) ==1){
				nonRecuringElement = key;
				break;
			}
		}
		
		return nonRecuringElement;
	}
}
