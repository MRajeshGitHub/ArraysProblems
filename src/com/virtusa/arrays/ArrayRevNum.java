package com.virtusa.arrays;

public class ArrayRevNum {

	public static void main(String[] args) {
		System.out.println("array revese number:");
		int []arr= {10,25,46,03,4,8,7,7,8,47,5,4,5,4};
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("arr ele in forword direction.."+arr[i]);
		}
		System.out.println("==============");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println("arr ele if backword direction :"+arr[i]);
		}
	}
}
