package com.algorithms.common;

import org.junit.Test;

import junit.framework.Assert;

public class ReverseLinkedListTest {
	
	@Test
	public void test() {
		Node head = new Node(1);
		Node secondNode = new Node(2);
		Node thirdNode = new Node(3);
		
		head.setNext(secondNode);
		secondNode.setNext(thirdNode);
		thirdNode.setNext(null);
		Assert.assertEquals(3,ReverseLinkedList.reverse(head).getVal());
		
	}
	
}
