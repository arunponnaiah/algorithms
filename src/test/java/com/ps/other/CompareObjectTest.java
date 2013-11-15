package com.ps.other;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ps.mock.Person;

public class CompareObjectTest {
	private Person person1,person2;
	
	@Before
	public void setUp() throws Exception {
		this.person1 = new Person();
		this.person1.setFirstName("Arun");
		
		this.person2 = new Person();
		this.person2.setFirstName("Arun");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCompareObjects(){
		if(person1.equals(person2)) System.out.println("equal");
		if(person1.hashCode() == person2.hashCode()) System.out.println("equal hashcode");
	}
}
