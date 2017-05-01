package com.algorithms.common;

import org.junit.Test;

import junit.framework.Assert;

public class StackByQueueTest {

	@Test
	public void test() {
		StackUsingQueue stackByQueue = new StackUsingQueue();
		stackByQueue.push(1);
		stackByQueue.push(2);
		stackByQueue.push(3);
		Assert.assertEquals(1,stackByQueue.pop());
	}
}
