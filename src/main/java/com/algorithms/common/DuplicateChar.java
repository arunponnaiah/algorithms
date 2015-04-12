package com.algorithms.common;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateChar {
	private Set<Character> duplicates;
	private Map<Character, Integer> map;
	
	/**
	 * constructor to initialize objects
	 */
	public DuplicateChar() {
		this.duplicates = new HashSet<Character>();
		this.map = new HashMap<Character, Integer>();
	}
	
	/**
	 * find duplicate chars in a string
	 * @param str
	 * @return
	 */
	public Set<Character> find( String str){
		save(str);
		return getDuplicates();
	}
	
	/**
	 * Find duplicates by iteration.
	 * @return
	 */
	private Set<Character> getDuplicates() {
		Iterator<Character> mapIter = this.map.keySet().iterator();
		while(mapIter.hasNext()){
			Character key = mapIter.next();
			if(this.map.get(key) > 1){
				this.duplicates.add(key);
			}
		}
		return this.duplicates;
	}
	
	/**
	 * Save input string in a Map.
	 * @param str
	 */
	private void save(String str) {
		char[] charArr = str.toCharArray();
		for(char ch : charArr){
			if(this.map.get(ch) != null){
				this.map.put(ch, this.map.get(ch) +1);
			}else{
				this.map.put(ch, 1);
			}
		}
	}
}
