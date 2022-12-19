package cubitClass;

import java.util.*;

public class HWC4 {

	static float adder(int a, int b) {
		int sum = a + b;
		return sum;
	}

	static float subtrac(int c, int d) {
		int diff = c - d;
		return diff;
	}

	static float product(int e, int f) {
		int prodt = e * f;
		return prodt;
	}

	static float divid(int g, int h) {
		int div = g / h;
		return div;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int x=sc.nextInt();
		System.out.println("Enter the second number");
		int y=sc.nextInt();
		System.out.println("What do you want to do? Select your option: 1. Add 2. Subtract 3. Multiply 4. Divide");
		int option=sc.nextInt();
		sc.close();
		if (option==1) {
			System.out.println("The sum of the numbers is "+ adder(x,y));
		}
		else if (option==2) {
			System.out.println("The difference of the numbers is "+subtrac(x,y));	
		}
		else if (option==3) {
			System.out.println("The product of the numbers is "+product(x,y));
		}
		else if (option==4){
			System.out.println("The division of the numbers result is "+divid(x,y));
		}
		else {
			System.out.println("Invalid option selected");
		}
	}
}
