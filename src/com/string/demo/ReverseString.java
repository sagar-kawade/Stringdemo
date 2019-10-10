package com.string.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {
	
	
	public static void main(String[] args) {
		/*
		 * 1st way by using StringBuilder
		 * 
		 * String str="programming wings";
		
		StringBuilder sb= new StringBuilder();
		
		sb.append(str);
		
		System.out.println(sb.reverse());
       */
		
		/*2nd way by using converting string to characters  array print one by one

		String str1="java language";
		
		char[] strary=str1.toCharArray();
		
		for (int i =strary.length-1;i>=0; i--) {
			System.out.print(strary[i]);
			
		}
		*/
		
		/*2nd way  converting string to characters  array  by using ListIterater
	
		 String str2= "advance java";
		 char[] strary2 =str2.toCharArray();
		 List<Character> liststr= new ArrayList<>();
		 
		 for (char chars : strary2) 
			 liststr.add(chars);
		
			 Collections.reverse(liststr);
		        ListIterator Litr = liststr.listIterator(); 
		        
		        while(Litr.hasNext()) 
		        	System.out.print(Litr.next());
		        	
		 
	*/	
	}

}
