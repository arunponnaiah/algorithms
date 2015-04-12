package com.algorithms.common;

public class LetterChange {
	
	 private static String vowel="aeiou";
		 private static String alphabets="abcdefghijklmnopqrstuvwxyz";
		
		 public String changeLetter(String str) {
			 
			 int index =0;
			 while(index < str.length()){
				 char ch = str.charAt(index);
				 System.out.println("ch >>  " + ch);
				 int charIndex = alphabets.indexOf(ch);
				 
				 if(ch=='z'){
					 str = new StringBuilder(str).replace(index, index+1,"A").toString();
				 }else if(charIndex!=-1 
						 && ch == alphabets.charAt(charIndex)){
					 char nextChar = alphabets.charAt(charIndex+1);
					  nextChar = validateVowel(nextChar);
					  str = new StringBuilder(str).replace(index, index+1,Character.toString(nextChar)).toString();
					  System.out.println("str : "+str);
				 }
				 index++;
			 }
		    return str;
		}


		private char validateVowel(char ch) {
			
			 if(this.isVowel(ch)){
				 ch = Character.toUpperCase(ch);
			 }
			return ch;
		}      
		 
		 
		 private boolean isVowel(char ch){
			 if(vowel.indexOf(ch)!= -1)
				 return true;
			 
			 return false;
		 }
	
}
