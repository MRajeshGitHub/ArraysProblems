package com.virtusa.arrays;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		System.out.println("Array Elements chek even Odd..");
		
		int [] ele= {11,25,14,16,35,78,44,69,357,12,14};
			//print using loops
		for(int i=0;i<ele.length;i++) {
			//System.out.println("Array ele is :"+ele[i]);
			//checking even and odd logic
	}
		System.out.println("first Element of arr is :"+ele[0]);
		System.out.println("last Elenemt of arr is : "+ele[ele.length-1]);
		
		if(ele[0]>ele[ele.length-1])
			System.out.println("first ele is Big");
		else
			System.out.println("last ele is Big");
		System.out.println("===========");
		
		if(ele[0]%2==0)
			System.out.println("even  :");
		else
			System.out.println("odd :");
		
	}
}
