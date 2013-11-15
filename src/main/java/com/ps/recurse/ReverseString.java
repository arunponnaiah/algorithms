package com.ps.recurse;

public class ReverseString {
	
	public String iterativeReverse(String str){
		char charArr[] = str.toCharArray();
		StringBuffer stringBuffer = new StringBuffer();
		for(int i=str.length()-1;i>=0;i--){
			stringBuffer.append(charArr[i]);
		}
		return stringBuffer.toString();
	}
	
	public String recursiveReverse(String str){
	    if ((null == str) || (str.length()  == 1)) {
	        return str;
	    }
	    
	    return recursiveReverse(str.substring(1)) + str.charAt(0);
	}

	public String reverseWordInString(String str) {
		String[] reverseStringArr = str.split(" ");
		StringBuffer stringBuffer = new StringBuffer();
		for(int i=0;i<reverseStringArr.length;i++){
			String reversedWord = this.recursiveReverse(reverseStringArr[i]);
			stringBuffer.append(reversedWord);
			if(i<reverseStringArr.length)
				stringBuffer.append(" ");
		}
		return stringBuffer.toString();
	}

}
