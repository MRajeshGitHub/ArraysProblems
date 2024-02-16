package com.virtusa.arrays;

public class ArrayTwoDimentionPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("array two dimention ele print using loops");
		int arr[][]= {{11,22,33,43,53,64},{25,35,45},{30,40,50,60}};
		
		for(int i=0;i<arr.length;i++) {
			//System.out.println("I :"+arr[i].length);
			
			for(int j=0;j<arr.length;j++) {
				System.out.println("I and J"+arr[i][j]);
			}
			
			System.out.println();
		}
		
		
	}

}
