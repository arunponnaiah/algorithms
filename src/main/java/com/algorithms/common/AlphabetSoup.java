package com.algorithms.common;

public class AlphabetSoup {
	public String test(String str){
		int index=0;
		while(index < str.length()-1){
			char[] charArr = str.toCharArray();
			char ch = str.charAt(index);
			char nextChar = str.charAt(index+1);
			
			if(ch > nextChar){
				char temp = charArr[index];
				charArr[index] = charArr[index+1];
				charArr[index+1] = temp;
				
				index = 0;
				continue;
			}
			index++;
		}
		return str;
	}
}
