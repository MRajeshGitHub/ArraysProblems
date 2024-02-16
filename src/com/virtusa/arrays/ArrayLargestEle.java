package com.virtusa.arrays;

public class ArrayLargestEle {

	public static void main(String[] args) {
		System.out.println("Array largest Element Search");
		System.out.println("------------------------------");
		
		int []arr= {10,24,9,56,0,35,7,8,6,0,4,55,3,66,78};
		int larg=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>larg) {
				larg=arr[i];
			}
		}
		System.out.println("largest ele of arr is :"+larg);
	}
}
