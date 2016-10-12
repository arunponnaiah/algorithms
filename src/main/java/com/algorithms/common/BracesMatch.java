package com.algorithms.common;

import java.util.Stack;

/**
 * Algorithm to check if braces are matched using Stack data structure.
 * @author arunponnaiah
 *
 */
public class BracesMatch {
	private static final String LEFT_BRACES="({[";
	
	/**
	 * Function to check if supplied String with braces are matched.
	 * @param input
	 * @return boolean
	 */
	public boolean isBalanced(String input){
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<input.length();i++){
			// push
			if(LEFT_BRACES.indexOf(input.charAt(i) ) != -1){
				stack.push(input.charAt(i));
			}
			// pop & validate
			else{
				Character lastElement = stack.pop();
				if( lastElement == null 
						|| lastElement == '(' && input.charAt(i) != ')' 
						|| lastElement == '{' && input.charAt(i) != '}' 
						|| lastElement == '[' && input.charAt(i) != ']' ){
					return false;
				}
			}
		}
		
		return true;
	}
	
}
