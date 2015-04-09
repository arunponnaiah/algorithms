package com.algorithms.java2novice;



public class CheckIfBinary {
	
	public boolean isBinary(int number){
		if(number!=0){
			int mod = number % 10;
			if(mod !=0 && mod != 1){
				return false;
			}
			isBinary(number/10);
		}	
		return true;
	}
}
