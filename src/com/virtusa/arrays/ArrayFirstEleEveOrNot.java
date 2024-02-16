package com.virtusa.arrays;

import java.util.Scanner;

public class ArrayFirstEleEveOrNot {

	public static void main(String[] args) {
		System.out.println("Array first element even or not ");
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		// int []no= {11,12,441,85};
		 if(n%2==0)
			 System.out.println("first ele is Even.");
		 else
			 System.out.println("First ele is Odd");
		 sc.close();
	}
}
