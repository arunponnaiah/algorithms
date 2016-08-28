package com.algorithms.scenario;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class PlantTest {
  private Plant plant;
  
	@Before
	public void setUp() throws Exception {
		this.plant = new Plant();
	}

	@Test
	public void test1() {
		Assert.assertEquals(true, this.plant.canPlant(new int[]{0,1,0,0},1));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(false, this.plant.canPlant(new int[]{0,1,0,0},2));
	}

}
