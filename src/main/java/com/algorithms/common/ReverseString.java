package com.algorithms.common;

/**
 * Different algorithms to reverse string
 * @author aponnaia
 *
 */
public class ReverseString {
	
	/**
	 * Uses StringBuffer to reverse string.
	 * @param str
	 * @return
	 */
	public String simpleReverse(String str){
		StringBuffer strBuffer = new StringBuffer();
		for(int i=str.length()-1;i>=0;i--){
			strBuffer.append(str.charAt(i));
		}
		return strBuffer.toString();
	}
	
	/**
	 * Uses recursion to reverse string.
	 * @param str
	 * @return
	 */
	public String recursiveReverse(String str){
	    if ((null == str) || (str.length()  == 1)) {
	        return str;
	    }
	    
	    return recursiveReverse(str.substring(1)) + str.charAt(0);
	}
	
	/**
	 * Uses swaping to reverse string.
	 * @param str
	 * @return
	 */
	public String reverseUsingSwap(String str){
		char[] charArray = str.toCharArray();
		int rightIndex = charArray.length-1;
		
		for(int leftIndex=0;leftIndex< rightIndex;leftIndex++,rightIndex--){
			char temp = charArray[leftIndex];
			charArray[leftIndex]= charArray[rightIndex];
			charArray[rightIndex] =temp;
		}
		return new String(charArray);
	}

}
