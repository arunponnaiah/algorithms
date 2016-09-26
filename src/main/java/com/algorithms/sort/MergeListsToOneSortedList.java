package com.algorithms.sort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeListsToOneSortedList {
	public static List<Integer> getFinalSortedList(List<List<Integer>> listOfSortedLists ){
		PriorityQueue<Integer> priorityQueue
			= new PriorityQueue<Integer>();
		
		for( List<Integer> sortedList: listOfSortedLists){
			priorityQueue.addAll(sortedList);
		}
		
		List<Integer> sortedList = new ArrayList<Integer>();
		Iterator<Integer> iter = priorityQueue.iterator();
		while (iter.hasNext()) {
			sortedList.add(priorityQueue.poll());
		}
		return sortedList;
	}
}
