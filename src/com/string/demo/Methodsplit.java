package com.string.demo;


public class Methodsplit {

	public static void main(String[] args) {
 String s1="Apple2xMicrosoft3xGood8ley";
 
 System.out.println(s1);
 // String []str=s1.split("\\d");
  String []str=s1.split("[a-zA-Z]");

  //System.out.println(str.toString());
 
 for (String str123 : str) {
	 System.out.println(str123);
	
}
	}

}
