package com.virtusa.arrays;

public class ArrayCuntSumEven {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		System.out.println("Array Count Sum and Even check...");
		
		int []arr= {10,12,13,6,95,3,58,66,4,44,25,43,6,7,84,69,4};
		int count=0;
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			//check even digits
			if(arr[i]%2==0) {
				System.out.println("Even values is :"+arr[i]);
			count++;
			sum=sum+arr[i];
		}}
		System.out.println("--------------------------------");
		System.out.println("count value is :"+count);
		System.out.println("sum value is :"+sum);
		
	}
}
