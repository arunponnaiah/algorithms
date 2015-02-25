package com.ps.coderbyte;



public class LetterCapitalize {

	public String capitalize(String string) {
		String[] strArr = string.split(" ");
		int index=0;
		final StringBuilder result = new StringBuilder(string.length());
		while(index < strArr.length ){
			String str = strArr[index];
			result.append(str.substring(0,1).toUpperCase()+str.substring(1));
			index++;
			if(index!=strArr.length)
				result.append(" ");
			
		}
		
		return result.toString();
	}

}
