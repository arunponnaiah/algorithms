package com.algorithms.list;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class MiddleNodeOfLinkedListTest {
	@Test
	public void test5() {
		LinkedList<Integer> list= new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		Assert.assertEquals(3,MiddleNodeOfLinkedList.find(list));
	}

	@Test
	public void test10() {
		LinkedList<Integer> list= new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		Assert.assertEquals(5,MiddleNodeOfLinkedList.find(list));
	}
	
}
