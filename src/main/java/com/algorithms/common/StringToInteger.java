package com.algorithms.common;

/**
 * Convert String to number without using Integer.parseInt()
 * 
 * Algorithm: 
 * 1. find the numeric value of each character.
 * 2. Use Horner's rule :  Multiply numeric value by 10 and iterate it until the last charater in string.
 * 		-  
 * Reference:
 * ---------
 * https://www.youtube.com/watch?v=StCmqCrg8No&index=47&list=PLn3A1FGnKiUyrMnXjwShy0LVV3zTgYg_z
 * 
 * @author arun
 *
 */
public class StringToInteger {
	
	public int convert(String intStr){
		int count=0;
		int zeroIntVal = (int)'0';
		int intEquivalentOfString =0;
		
		while (count < intStr.length()){
			char ch = intStr.charAt(count);
			int intEquivalentOfChar = (int)ch - zeroIntVal; // find the numeric value of each character 
			intEquivalentOfString = (intEquivalentOfString * 10) + (intEquivalentOfChar); 
			count++;
		}
		return intEquivalentOfString;
	}
}
