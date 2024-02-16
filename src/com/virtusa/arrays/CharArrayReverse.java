package com.virtusa.arrays;

public class CharArrayReverse {

	public static void main(String[] args) {
		System.out.println("char array in reveesr order..");
		char []ch= {'a','e','i','o','u'};
		
		for(int i=ch.length-1;i>=0;i--) {
			char c=ch[i];
			System.out.println("char array ele :"+c);
		}
	}
}
