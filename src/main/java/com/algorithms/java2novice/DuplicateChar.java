package com.algorithms.java2novice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateChar {
	Set<Character> duplicates = new HashSet<Character>();
	Map<Character, Integer> map = new HashMap<Character, Integer>();
	
	public Set<Character> find( String str){
		char[] charArr = str.toCharArray();
		for(char ch : charArr){
			if(map.get(ch) != null){
				map.put(ch, map.get(ch) +1);
			}else{
				map.put(ch, 1);
			}
		}
		
		Iterator<Character> mapIter = map.keySet().iterator();
		while(mapIter.hasNext()){
			Character key = mapIter.next();
			if(map.get(key) > 1){
				duplicates.add(key);
			}
		}
		return duplicates;
	}
}
