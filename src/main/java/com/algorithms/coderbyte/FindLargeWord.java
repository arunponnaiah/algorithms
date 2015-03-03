package com.algorithms.coderbyte;

public class FindLargeWord {
	int largeWordLen=0;
	String largeWord="";
	
	public String find(String inString){
String[] strArr = inString.split(" ");
		
		int largeWordLen=0;
		String largeWord="";
		for(String str : strArr){
			str = str.replaceAll("[^a-zA-Z]", " ");
			if(str.length() <= largeWordLen){
				continue;
			}else{
				largeWordLen = str.length();
				largeWord=str;
			}
		}
		return largeWord;
	}
}
