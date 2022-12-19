package com.SortAlgorithms;

public class A_SelectionSort {
	
	public void selectionSorter(int [] arrayIn) {
		int temp;
		for (int i=0;i<arrayIn.length-1;i++) {
			for (int j=i+1;j<=arrayIn.length-1;j++) {
				if(arrayIn[i]>arrayIn[j]) {
					temp=arrayIn[i];
					arrayIn[i]=arrayIn[j];
					arrayIn[j]=temp;	
				}}}}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_SelectionSort ssorter=new A_SelectionSort();
		int[] testArr=new int[] {2,9,6,1,7,0};
		ssorter.selectionSorter(testArr);
		for (int x:testArr) {
			System.out.print(x);
			System.out.print(" ");}
		System.out.println("\n");
	}}
//WAP for strings