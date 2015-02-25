package com.ps.other;

public class MultipleofAnyInteger {
	public void print(int min, int max,int divider) {
		if(min <=max){
			if( (min%divider) ==0){
//				System.out.println(min);
			}
			min++;
			print(min, max, divider);
		}
	}
}
