package com.algorithm.other;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sun.text.normalizer.CharTrie.FriendAgent;

import com.algorithm.mock.Fruit;

public class SortObjectTest {
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Fruit fruit1 = new Fruit();
		fruit1.setName("Apple");
		fruit1.setQuantity(100);
		Fruit fruit2 = new Fruit();
		fruit2.setName("orange");
		fruit1.setQuantity(50);
		Fruit[] fruits = new Fruit[]{fruit2,fruit1};
		Arrays.sort(fruits);
		for(Fruit fruit:fruits)
			System.out.println(fruit.getName() +" >>> "+fruit.getQuantity());
//		Arrays.sort(fruits,Fruit.FruitNameComparator);
//		for(Fruit fruit:fruits)
//			System.out.println(fruit.getName());
	}

}
