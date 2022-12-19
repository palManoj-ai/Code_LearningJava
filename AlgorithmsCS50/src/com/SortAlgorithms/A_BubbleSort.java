package com.SortAlgorithms;

public class A_BubbleSort {
	public int[] bubbleSorter(int[] arrayIn) {
		int temp;
		boolean swap = true;
		for (int i = 0; i < arrayIn.length; i++) {
			for (int j = 0; j < arrayIn.length-1; j++) {
				if (arrayIn[j] > arrayIn[j + 1]) {
					swap = true;
					temp = arrayIn[j];
					arrayIn[j] = arrayIn[j + 1];
					arrayIn[j + 1] = temp;
				}
			}
			if (swap == false) {
				break;
			}
		}
		return arrayIn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_BubbleSort ssorter = new A_BubbleSort();
		int[] testArr = new int[] { 2, 6, 1, 9, 0, 2 };
		testArr = ssorter.bubbleSorter(testArr);
		for (int x : testArr) {
			System.out.print(x);
			System.out.print(" ");
		}
		System.out.println("\n");

	}

}
