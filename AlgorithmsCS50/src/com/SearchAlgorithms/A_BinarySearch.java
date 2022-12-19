package com.SearchAlgorithms;
import java.util.Arrays;

public class A_BinarySearch {
	//Instead of searching through entire array as in LS we divide the data in successive halfs and perform search.
	//note that in case of large data, it needs to implement the 
	
	public void binSearchInt(int x, int[] arrayInp) {
		int len=arrayInp.length;
		
		//sorting the input string array by use of java.util.arrays
		Arrays.sort(arrayInp);  //we will see sorting algorithms too later
		
		if (x==arrayInp[len/2]) {
			System.out.println("Number "+x+" is in the array.");
		}
		else if(x<arrayInp[len/2]) {
			for (int j=0;j<len/2;j++) {
				if(x==arrayInp[j]) {
					System.out.println("Number "+x+" is in the array.");
				}
			}
		}
		else {
			for (int k=len/2;k<len;k++) {
				if(x==arrayInp[k]) {
					System.out.println("Number "+x+" is in the array.");
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO WAP a sorting algorithm
		A_BinarySearch obj=new A_BinarySearch();
		int[] arr=new int[]{2,4,6,16,19,0};
		obj.binSearchInt(2,arr);
		

	}

}
