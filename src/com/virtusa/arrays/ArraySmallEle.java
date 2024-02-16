package com.virtusa.arrays;

public class ArraySmallEle {

	public static void main(String[] args) {
		System.out.println("Smallest element in the array...");
		
		int []arr= {4,21,6,88,45,36,12,8,39,98,74,11,23};
		
		int small=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<small) {
				small=arr[i];
			}
		}
		System.out.println("smallese ele :"+small);
	}
}
