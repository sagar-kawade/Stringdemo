package com.string.demo;

public class Samplestring {

	public static void main(String[] args) {

		Samplestring s1 =new Samplestring();
		String a1= "java";
		String a2= "java";
		String a5=new String("java");
		String a6=new String("java");			
		System.out.println("a1  hashcode -"+a1.hashCode());
		System.out.println("a2  hashcode -"+a2.hashCode());
		System.out.println("a5  hashcode -"+a5.hashCode());
		System.out.println("a6  hashcode -"+a6.hashCode());
		System.out.println("a1 identityhashcode -"+System.identityHashCode(a1));
		System.out.println("a2 identityhashcode -"+System.identityHashCode(a2));
		System.out.println("a5 identityhashcode -"+System.identityHashCode(a5));
		System.out.println("a6 identityhashcode -"+System.identityHashCode(a6));
		System.out.println("a1 object"+a1);
		System.out.println("s1 object"+s1);

		
	}

}
