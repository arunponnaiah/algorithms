package com.algorithms.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MaxRepeatWords {

	public String find(File file) throws Exception {
		Map<String, WordInfo> map = saveWordsFromFile(file);
		TreeSet<WordInfo> sortedSet = sortCount(map);
		return sortedSet.first().getWord();
	}

	private TreeSet<WordInfo> sortCount(Map<String, WordInfo> map) {
		TreeSet<WordInfo> sortedSet  = new TreeSet<WordInfo>();
		Set<String> words = map.keySet();
		for(String word : words){
			sortedSet.add(map.get(word));
		}
		return sortedSet;
	}

	private Map<String, WordInfo> saveWordsFromFile(File file) throws FileNotFoundException,
			IOException {
		FileReader fileReader = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);
		String line=null;
		Map<String, WordInfo> map = new HashMap<String, WordInfo>();
		
		while( (line = reader.readLine()) !=null){
			String[] words = line.split(" ");
			for(String word : words){
				WordInfo wordInfo = map.get(word);
				if(wordInfo==null){
					wordInfo = new WordInfo(word,1);
				}else{
					wordInfo.setCount(wordInfo.getCount()+1);
				}
				map.put(word, wordInfo);
			}
		}
		return map;
	}
	
	private class WordInfo implements Comparable<WordInfo>{
		private String word;
		private int count;
		
		public WordInfo(String word,int count){
			this.word = word;
			this.count = count;
		}
		
		public String getWord() {
			return word;
		}
		public void setWord(String word) {
			this.word = word;
		}
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		
		public int compareTo(WordInfo wordInfo) {
			if(this.count < wordInfo.getCount()){
				return 1;
			}else if(this.count > wordInfo.getCount()){
				return -1;
			}
			return 0;
		}
		
		
	}

}
