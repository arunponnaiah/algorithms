package com.algorithms.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Count specific character ( for eg : A ) in a file using Java RegEx
 * @author arunponnaiah
 *
 */
public class SpecificCharCount {

	/**
	 * Takes filePath and element to find count.
	 * Use RegEx to implement it.
	 * 
	 * @param filePath
	 * @param searchElement
	 * @return
	 * @throws IOException
	 */
	public static int countChar(String filePath, char searchElement) throws IOException{
		File file = new File(filePath);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String line="abcd";
		int count=0;
		while( (line=br.readLine() ) !=null ){
			line = line.toLowerCase().replaceAll("[^a]", "");
			count = count+ line.length();
		}
		return count;
	}
}
