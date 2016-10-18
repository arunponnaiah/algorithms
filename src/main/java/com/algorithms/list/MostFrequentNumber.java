package com.algorithms.list;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MostFrequentNumber {

	public static int find(List<Integer> list){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count=0;
		for(Integer element : list){
			if(map.get(element) !=null){
				count = map.get(element);
				count++;
				map.put(element,count);
			}else{
				count=1;
				map.put(element,count);
			}
		}
		
		Set<Integer> keys = map.keySet();
		int maxCount = 0;
		int mostOccuredElement=0;
		for(Integer key: keys){
			if(maxCount < map.get(key)){
				maxCount =map.get(key);
				mostOccuredElement = key;
			}
		}
		return mostOccuredElement;
	}
}
