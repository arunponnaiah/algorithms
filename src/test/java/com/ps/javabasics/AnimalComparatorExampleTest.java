package com.ps.javabasics;

import org.junit.Before;
import org.junit.Test;

import com.ps.mock.Animal;

public class AnimalComparatorExampleTest {
	
	private AnimalComparatorExample ace;
	
	@Before
	public void setup(){
		this.ace= new AnimalComparatorExample();
	}
	
	@Test
	public void testCompare(){
		Animal animal1 = new Animal();
		animal1.setName("Lion");
		
		Animal animal2 = new Animal();
		animal2.setName("Tiger");
		
		
		
	}

}
