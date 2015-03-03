package com.algorithms.java2novice;

public class MiddleIndex {
	public int find(int[] input){
		int endIndex = input.length - 1;
        int startIndex = 0;
        int sumLeft = 0;
        int sumRight = 0;
        
        while (true) {
            if (sumLeft > sumRight) {
                sumRight += input[endIndex--];
            } else {
                sumLeft += input[startIndex++];
            }
            if (startIndex > endIndex) {
                if (sumLeft == sumRight) {
                    break;
                } else {
                   return 0;
                }
            }
        }
        return endIndex;
	}
}
