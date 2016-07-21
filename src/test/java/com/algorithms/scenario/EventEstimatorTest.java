package com.algorithms.scenario;

import org.junit.Before;
import org.junit.Test;

import com.algorithms.scenario.EventEstimator;

import junit.framework.Assert;

public class EventEstimatorTest {
	private EventEstimator eventEstimator;
	@Before
	public void setUp() throws Exception {
		this.eventEstimator = new EventEstimator();
	}

	@Test
	public void test1() {
		Assert.assertEquals(8, this.eventEstimator.getEventCount("2016-03-28 20:47:59"));
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(3, this.eventEstimator.getEventCount("2016-03-28 21:12:47"));
	}

}
