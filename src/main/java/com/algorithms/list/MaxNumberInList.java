package com.algorithms.list;

import java.util.List;

public class MaxNumberInList {

	public static int find(List<Integer> list){
		int maxNumber = list.get(0);
		
		for(int i=1; i<list.size(); i++){
			if(list.get(i) > maxNumber ){
				maxNumber = list.get(i);
			}
		}
		
		return maxNumber;
	}
}
