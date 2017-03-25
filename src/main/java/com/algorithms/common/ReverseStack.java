package com.algorithms.common;

import java.util.Stack;
/**
 * Reverse a stack by using only push() , pop() & isEmpty().
 * The algorithm uses internal System Stack as temporary space to store and retrieve stack items.
 * 
 * @author aponnaiah
 *
 */
public class ReverseStack {
	
	/**
	 *  pop all of the items that are currently in Stack<Integer> and store in system stack using recursive calls using reverse(stack);
	 * @param stack
	 * @return
	 */
	public Stack<Integer> reverse(Stack<Integer> stack) {
		if(!stack.isEmpty()){
			Integer n = stack.pop();
			reverse(stack);
			reverseStack(stack,n);
		}
		return stack;
	}
	
	/**
	 * Step 1 : Push items from system stack in to Stack<Integer> and 
	 * then pop it back to system stack using recursive calls using reverseStack(stack, n) 
	 * to store it in reverse order.
	 * 
	 * Step 2: Push items from system stack back in to Stack<Integer>
	 * 
	 * @param stack
	 * @param n
	 */

	private void reverseStack(Stack<Integer> stack, Integer n) {
		if(stack.isEmpty())
			stack.push(n);
		else{
			int item = stack.pop();
			reverseStack(stack, n);
			stack.push(item);
		}
	}
	
	public  Stack<Integer> reverseRevisioned(Stack<Integer> stack){
		if(!stack.isEmpty()){
			int item = stack.pop(); 
			reverseRevisioned(stack);
			redoPopAndCopy(stack,item);
		}
		
		return stack;
	}
	private void redoPopAndCopy(Stack<Integer> stack, Integer item){
		if(stack.isEmpty()){
			stack.push(item);
		}else{
			Integer temp = stack.pop();
			redoPopAndCopy(stack, item);
			stack.push(temp);
		}
		
	}
}
