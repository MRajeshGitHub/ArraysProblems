package com.virtusa.arrays;

public class Test {

public static void main(String[] args) {
	
	int[][] a = {{10,20,30},{2,3,4},{6,8,9,3}};
	//     0  1  2   0 1 2   0 1 2 3 
System.out.println(a[0][2]);
System.out.println(a[1][2]);
System.out.println(a[1][1]);
System.out.println(a[2][2]);

for (int i=0;i<a.length;i++)					//	number of elements 
{	for (int j=0;j<a[i].length ;j++ )			//	Every element data 
{	System.out.print(a[i][j]+"\t");
}
System.out.println("");
}
}
}
