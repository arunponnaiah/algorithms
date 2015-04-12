package com.algorithms.common;

public class PerfectNumber {

	public boolean isPerfectNumber(int n) {
		int reminder=0;
		int count=0;
		for(int i=1; i<=n/2;i++){
			 reminder = n%i;
			if(reminder==0){
				count = count + i;
			}
		}
		
		if(count== n){
			return true;
		}
		
		return false;
	}
	
}
