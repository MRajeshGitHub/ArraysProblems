package com.virtusa.arrays;

public class DisplayArrayElements {

	public static void main(String[] args) {
		System.out.println("Display Array Elements...");
		System.out.println("================");
		int []  marks= {12,45,87,99,66,48,357,45};
		
		System.out.println("first element of the Array :"+marks[0]);
		System.out.println("================");
		System.out.println("Secong element of the Array :"+marks[1]);
		System.out.println("Third element of the Array :"+marks[2]);
		System.out.println("forth element of the Array :"+marks[3]);
		System.out.println("fifth element of the Array :"+marks[4]);
		//int len= marks.length;
		System.out.println("================");
		System.out.println("last Element of the Arrays is :"+marks[marks.length-1] );
		//length of the array
		System.out.println("================");
		System.out.println("length of the array is : "+marks.length);
		
	}
}
