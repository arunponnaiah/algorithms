package com.ps.popsugar;

import java.util.LinkedList;
import java.util.List;

/**
 * Josephus problem 
 * Reference : http://en.wikipedia.org/wiki/Josephus_problem
 * @author arun
 *
 */
public class Josephus {
	
	/*
	 * 
	 */
	public int execute(int n, int k){
        
        List<Integer> prisoners = new LinkedList<Integer>();
        for(int i = 0;i < n;i++){
            prisoners.add(i);
        }
        System.out.println("Prisoners executed in order:");
        int killIdx = 0;
        while(prisoners.size() > 1){
            killIdx = (killIdx + k - 1) % prisoners.size();
            System.out.print(prisoners.get(killIdx) + " ");
            prisoners.remove(killIdx);
        }
        System.out.println();
        return prisoners.get(0);
    }
	
	
}
