package com.algorithms.java2novice;

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
		this.arrayList.add(1);
	}
	
	@Test
	public void testRemove() {
		this.arrayList.remove(1);
	}
	
	@Test
	public void testSize() {
		int size = this.arrayList.size();
	}
	
	@Test
	public void testGet() {
		Integer integer = this.arrayList.get(0);
	}
}
