package com.algorithms.common;

/**
 * Algorithm to reverse linkedlist by iteration.
 * @author arunponnaiah
 *
 */
public class ReverseLinkedList {
	
	/**
	 * Method takes head node (currentNode) and uses 2 temp nodes (prevNode, nextNode) to reverse linkedlist.
	 * @param currentNode
	 * @return
	 */
	public static Node reverse(Node currentNode){
		Node prevNode=null;
		Node nextNode = null;
		while(currentNode!=null){
			nextNode = currentNode.getNext();
			currentNode.setNext(prevNode);
			prevNode = currentNode;
			currentNode = nextNode;
		}
		return prevNode;
	}
}
