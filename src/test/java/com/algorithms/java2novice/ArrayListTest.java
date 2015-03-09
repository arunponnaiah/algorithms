package com.algorithms.java2novice;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class ArrayListTest {
	private ArrayList arrayList;

	@Before
	public void setUp() throws Exception {
		this.arrayList = new ArrayList();
	}

	@Test
	public void testAdd() {
		boolean isAdded = this.arrayList.add(1);
		Assert.assertEquals(true, isAdded);
	}
	
	@Test
	public void testRemove() {
		this.testAdd();
		Assert.assertTrue(this.arrayList.remove(1));
	}
	
	@Test
	public void testSize() {
		this.testAdd();
		int size = this.arrayList.size();
		Assert.assertEquals(1, size);
	}
	
	@Test
	public void testGet() {
		this.testAdd();
		int val = this.arrayList.get(0);
		Assert.assertEquals(1, val);
	}
	
	@Test
	public void testIsEmpty(){
		this.testAdd();
		Assert.assertFalse(this.arrayList.isEmpty());
	}
	
	@Test
	public void testContains(){
		this.testAdd();
		this.testAdd();
		Assert.assertTrue(this.arrayList.contains(1));
	}
}
