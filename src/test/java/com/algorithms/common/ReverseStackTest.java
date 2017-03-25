package com.algorithms.common;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Stack;

import org.junit.Before;
import org.junit.Test;

import com.algorithms.common.ArrayList;
import com.algorithms.common.ReverseStack;

public class ReverseStackTest {
	private ReverseStack reverseStack;

	@Before
	public void setUp() throws Exception {
		this.reverseStack = new ReverseStack();
	}

	@Test
	public void test() {
		Stack<Integer> expectedStack = new Stack<Integer>();
		expectedStack.push(3);
		expectedStack.push(2);
		expectedStack.push(1);
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		assertEquals(expectedStack , this.reverseStack.reverseRevisioned(stack));
	}

}
