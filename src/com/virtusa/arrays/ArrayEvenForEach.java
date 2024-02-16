package com.virtusa.arrays;

public class ArrayEvenForEach {
	public static void main(String[] args) {
		System.out.println("Array even search using forEach loop");
		
		int []arr= {4,21,6,88,45,36,12,8,39,98,74,11,23};
		int cont=0;
		for(int x:arr) {
			if(x%2==0)
				System.out.println("even :"+x);
			cont++;
			
		}
		System.out.println("counct is :"+cont);
		System.out.println("========================");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				System.out.println("even no is :"+arr[i]);
		}
	}

}
