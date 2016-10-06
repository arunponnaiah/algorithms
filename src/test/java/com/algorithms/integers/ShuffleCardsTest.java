package com.algorithms.integers;

import org.junit.Before;
import org.junit.Test;

public class ShuffleCardsTest {
	private ShuffleCards shuffleCards;
	
	@Before
	public void setUp() throws Exception {
		this.shuffleCards = new ShuffleCards();
	}

	@Test
	public void test() {
		int[] cards = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int[] output = this.shuffleCards.shuffle(cards);
		for(int val : output){
			System.out.print(val+",");
		}
	}

}
