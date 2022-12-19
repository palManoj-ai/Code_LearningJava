package com.SearchAlgorithms;

public class A_LinearSearch {

	public boolean ALinearSearch(int x, int[]arrayList) {
		for (int i=0;i<arrayList.length;i++) {
			if (arrayList[i]==x) {
				return (boolean)true;
			}
			//try placing return false within the if parentheses
		}
		return false;
	}
	
	public static void main(String[] args) {
		//Implementing linear search
		int[] numbers= new int[] {4,6,8,2,7,5,0};  //list
		int[] testCaseNo=new int[] {4,0,18,67};    //test list
		A_LinearSearch asearch=new A_LinearSearch();
		for(int i=0;i<testCaseNo.length;i++) {
			System.out.println("Number "+testCaseNo[i]+" is in the array: "+asearch.ALinearSearch(testCaseNo[i],numbers));
		}
		
	//WAP for string, double paired data or pair in java/tuple in Python
		
		
		
				
}
}