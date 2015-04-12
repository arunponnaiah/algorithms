package com.algorithms.common;

public class SimpleSymbols {

	public String test(String string) {
		String result = "false";
		
		for(char c='a';c<='z';c++){
			int index = string.indexOf(c);
			System.out.println("index of "+c + " is " + index);
			System.out.println(" str length " + string.length());
			if(	index!=-1){
				
				if(index < string.length() 
						&& index >0){
					
					int beginIndex = index-1;
					int endIndex = index+2;
					
					if(string.substring(beginIndex, endIndex).equals("+"+c+"+")){
						result = "true";
					}else{
						return "false";
					}
				}else{
					return "false";
				}
				
			}
		}
		
		return result;
	}

}
