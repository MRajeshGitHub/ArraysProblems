package com.virtusa.arrays;

public class JaggedArrayLength {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Jagged array length...");
		
		int arr[][]= {{10,20,30,40,50,60},{20,30,40},{30,40,50,60},{50,60}};
		
		System.out.println("row of  arr is :"+arr.length);//total count of arr ele
		System.out.println("arr[0] is :"+arr[0].length);
		System.out.println("arr[1] is :"+arr[1].length);
		System.out.println("arr[2] is :"+arr[2].length);
		System.out.println("arr[3] is :"+arr[3].length);
		System.out.println("===============");
		int len=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].length);
	    len= len+arr[i].length;
	     
			
		}
		  System.out.println("Total element if jagged arr is :"+len);
		
		
	}
}
