package com.algorithms.scenario;

public class Plant {
	public boolean canPlant(int[] arr,int n){
		int index=0;
		while( (index < arr.length-1)
				&& (n>0) ){
			if((arr[index]^1) == 0){
				index = index +2;
			}else if( (arr[index+1]^1) !=0 ){
				arr[index] = 1;
				n = n -1;
				System.out.println(n);
			}
		}
		
		if(n>0)
			return false;
		return true;
	}
}
