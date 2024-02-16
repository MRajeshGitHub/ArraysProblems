package com.virtusa.arrays;

public class ArrayElePrint {

	public static void main(String[] args) {
		System.out.println("Array element print..");
		int []arr= {10,20,15,44,20,30,40,45,36};
		System.out.println("lenth of arr is :"+arr.length);
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Array ele is :"+arr[i]);
		}
	}
}
