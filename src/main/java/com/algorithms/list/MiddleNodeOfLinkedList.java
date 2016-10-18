package com.algorithms.list;

import java.util.LinkedList;

/**
 * Algorithm to find middle node of linkedlist.
 * @author arunponnaiah
 *
 */
public class MiddleNodeOfLinkedList {
	
	/**
	 * Function to find middle node by iterating linkedlist using 2 indices i,j 
	 * @param list
	 * @return integer
	 */
	public static int find(LinkedList<Integer> list){
		int middleElement=-1;
		
		for(int i=0,j=0; i< list.size(); i+=2,j++){
			middleElement=list.get(j);
		}
		return middleElement;
	}
}
