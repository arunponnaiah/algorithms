package com.algorithms.other;

import java.util.LinkedList;
import java.util.List;

/**
 * Josephus problem 
 * Reference : 
 * 1. http://en.wikipedia.org/wiki/Josephus_problem
 * 2. http://www.geeksforgeeks.org/josephus-problem-set-1-a-on-solution/
 * 3. http://rosettacode.org/wiki/Josephus_problem
 *
 */
public class Josephus {
	
	/*
	 * Time complexity is O(n^2) . Range tree implementation helps to achieve O(nlogn).
	 */
	public int findSurvivorByList(int n, int k){
        
        List<Integer> prisoners = new LinkedList<Integer>();
        for(int i = 0;i < n;i++){
            prisoners.add(i);
        }
    
        int killIdx = 1;
        while(prisoners.size() > 1){
            killIdx = (killIdx + k - 1) % prisoners.size(); 
            prisoners.remove(killIdx);
        }
        return prisoners.get(0);
    }
	
	/*
	 * Time complexity is O(n) . Range tree implementation helps to achieve O(nlogn).
	 */
	
	public int findSurvivorByRecursion(int n,int k){
		if (n == 1)
		    return 1;
		else
		    return (findSurvivorByRecursion(n - 1, k) + k-1) % n + 1;
	}
	
}
