package com.algorithms.integers;

import java.util.Random;

/**
 * ShuffleCards is based on Fisher Yates shuffling algorithm
 * It is used to solve shuffling problem.
 *
 * Shuffling problem: A problem of computing a random permutation of N objects.
 * 
 * @author arunponnaiah
 *
 */
public class ShuffleCards {
	
	public int[] shuffle(int[] cards){
		int arrLen = cards.length;
		Random random = new Random();
		int randomVal = random.nextInt(arrLen);
		
		//swap
		int temp = cards[randomVal];
		cards[randomVal] = cards[arrLen-1];
		cards[arrLen-1] = temp;
		return cards;
		
	}
}
