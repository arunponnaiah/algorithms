package com.algorithms.common;

/**
 * Algorithm to validate IP without using RegEx.
 * @author arunponnaiah
 *
 */
public class IPValidation {

	/**
	 * Validates IP address.
	 * @param IP
	 * @return boolean
	 */
	public static boolean isValid(String IP){
		IP = IP.trim();
		if(IP.startsWith(".") || IP.endsWith(".")){
			return false;
		}
			
		String[] ipArr = IP.split("\\.");
		if(ipArr.length  == 4){
			 for(String str : ipArr){
				 if(str.length() >= 0 && str.length() <=3){
					 try  
					  {  
					   int val= Integer.parseInt(str); 
					   if(val < 0 && val > 255){
						   return false; 
					   }
					  }  
					  catch(NumberFormatException nfe)  
					  {  
					    return false;  
					  }  
				 }else{
					 return false;
				 }
			 }
		}else{
			return false;
		}
		return true;
	}
}
