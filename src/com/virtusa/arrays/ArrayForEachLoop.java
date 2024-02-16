package com.virtusa.arrays;

public class ArrayForEachLoop {

	public static void main(String[] args) {
		System.out.println("ForEach loop usecse:");
		
		int []arr= {10,20,30,40,50,60,90,80,1};
		//print using for loops
		for(int i=0;i<=arr.length-1;i++) {
			
			int x=arr[i];
			System.out.println(x);
		}
		//print using forEach loop
		System.out.println("pring using forEach Loop");
		for(int x:arr) {
			System.out.println(x);
		}
	}
}
