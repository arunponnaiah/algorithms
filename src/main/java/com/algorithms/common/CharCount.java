package com.algorithms.common;

import java.util.HashMap;
import java.util.Map;

/**
 * count characters in a string
 * @author aponnaia
 *
 */
public class CharCount {
	
	public String count(String str){
		char[] strArr = str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int index = 0 ; index < strArr.length; index++){
	        if(map.containsKey(strArr[index])){
	        	int count = map.get(strArr[index]);
	        	count++;
	        	map.put(strArr[index],count);
	        }else{
	        	map.put(strArr[index],1);
	        }
		}
		
		return map.toString();
	}
	
}
