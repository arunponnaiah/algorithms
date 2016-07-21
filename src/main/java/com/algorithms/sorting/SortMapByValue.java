package com.algorithms.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapByValue {
	
	public String sort(Map<String, Integer> map){
		
	    Set<Entry<String, Integer>> set = map.entrySet();
	    List<Entry<String , Integer>> mapList = new ArrayList<Entry<String,Integer>>(set);
	    Collections.sort(mapList , new Comparator<Entry<String, Integer>>()
	    {
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return (o2.getValue().compareTo(o1.getValue()));
			}
		});
	    return mapList.toString();
	}
	
	public static void main(String[] args) {
		SortMapByValue sortMapByValue = new SortMapByValue();
		Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("yahoo.com", 25);
        map.put("google.com", 100);
        map.put("facebook.com", 75);
		sortMapByValue.sort(map);
	}
}
