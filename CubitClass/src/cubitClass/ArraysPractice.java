package cubitClass;
import java.lang.reflect.Array;
//import to check datatype of array in line 11
import java.util.Arrays;
//import to sort the array
import java.util.Collections;

public class ArraysPractice {

	public static void main(String[] args) {
		// WAP to print an array where the given array is divided by 5
		float arry[] = new float[] { 2, 15, 22, 25, 37 };
		@SuppressWarnings("rawtypes")
		Class c=arry.getClass();
		System.out.println("Check if the array is array or not: "+c.isArray());
		System.out.println("The array is of type: "+c.getComponentType());
		System.out.println("The length of the array is: "+Array.getLength(arry));
		
		//To sort the arrays
		Arrays.sort(arry);
		System.out.println("The sorted array in ascending order is: ");
		for (float x: arry) {
			System.out.println(x);
		}
		//in descending order
		System.out.println("The sorted array in descending order is: ");
		Arrays.sort(arry,Collections.reverseOrder());
		for (float y: arry) {
			System.out.println(y);
		}
		
		//Dividing array element
//		for (int i = 0; i < arry.length; i++) {
//			arry[i] = arry[i] / 5;
//		}
		
		//printing array elements using for loop
//		for (int j = 0; j < arry.length; j++) {
//			System.out.println(arry[j]);
//		}
		//printing array elements using for each loop
//		for (float i:arry) {
//			System.out.println(arry[i]);
//		}
		
//		System.out.println("Reverse Array");
//		for (int m = arry.length - 1; m >= 0; m--) {
//			System.out.println(arry[m]);
			
		//2D array and printing it
//		int[][] flatNos=new int[2][3];
//		flatNos[0][0]=101;
//		flatNos[0][1]=102;
//		flatNos[0][2]=103;
//		flatNos[1][0]=104;
//		flatNos[1][1]=105;		
//		flatNos[1][2]=106;
//		//to access and print the elements in the 2D array, length of 2D array is the no of rows of the array
//		System.out.println("The length of array is "+flatNos.length);
//		for (int i=0;i<flatNos.length;i++) {
//			for (int j=0;j<flatNos[i].length;j++) {
//				System.out.print(flatNos[i][j]);
//				System.out.print(" ");
//			}
//			System.out.println("");
//		}
		}
}

