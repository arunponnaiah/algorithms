package com.algorithms.scenario;

/**
 * Given array : arr[0,1,0,0]  & number of 1’s
 * Condition : 1 can’t be next to another 
 * UC : if n=1 , returns true . if n=2 returns false;  
 * 
 * @author aponnaia
 */
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
