package com.algorithms.common;

import java.util.LinkedList;

/**
 * Stack using queue (linkedlist) data structure.
 * @author arunponnaiah
 *
 */
public class StackUsingQueue {
	private LinkedList<Integer> queue;
	
	public StackUsingQueue(){
		this.queue = new LinkedList<Integer>();
	}
	
	/**
	 * Add an element in queue.
	 * Reverse elements such that last element is transferred to first index.
	 * @param x
	 */
	public void push(int x){
		this.queue.add(x);
		int size = queue.size();
		if(size > 1){
			this.queue.add(this.queue.remove());
			size--;
		}
	}
	
	/**
	 * remove element from queue.
	 * @return
	 */
	public int pop(){
		return this.queue.remove();
	}
}
