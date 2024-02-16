package com.virtusa.arrays;

public class ArrayTwoDimentions {

	public static void main(String[] args) {
		
		System.out.println("Array with two dimentions....");
		
		int arr[][]= new int [4][3];
		//checking the length of array
		System.out.println("length of 1Row is :"+arr[0].length);
		System.out.println("length of 2Row is :"+arr[1].length);
		System.out.println("length of 3Row is :"+arr[2].length);
		System.out.println("length of 4Row is :"+arr[3].length);
		
		System.out.println("length of 1 columns is :"+arr.length*arr[0].length);
		
	}
}
