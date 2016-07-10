package com.algorithms.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentNumberInList {
	
	public int get(ArrayList<Integer> input) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max=1 , maxElement=0;
		for(int element: input){
			if(map.get(element) != null){
				int count = map.get(element);
				count++;
				map.put(element, count);
				if(count > max){
					max = count;
					maxElement = element;
				}
			}else{
				map.put(element,1);
			}
		}
		
		return maxElement;
	}
}
