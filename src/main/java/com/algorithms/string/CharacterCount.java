package com.algorithms.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/**
 * count number of duplicate characters 
 * @author aponnaia
 *
 */
public class CharacterCount {
	public Map<Character, Integer> count(String str){
		 //String str = "abcabcdef";
		char[] strArr = str.toCharArray();
		
		Arrays.sort(strArr);
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
		
		return map;
	}
}
