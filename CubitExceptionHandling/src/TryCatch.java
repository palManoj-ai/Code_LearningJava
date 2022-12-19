
import java.util.Scanner;


public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers to divide");
		float a=0,b=0;
		try {
			a=sc.nextFloat();
		}catch (Exception ex1) {
			System.out.println(ex1.getStackTrace());
			System.out.println(ex1.getMessage());
		}
		try {
			b=sc.nextFloat();
		}catch (Exception ex2) {
			System.out.println(ex2.getStackTrace());
			System.out.println(ex2.getMessage());
		}
		sc.close();
		float result =10.2f;
		System.out.println("Let us try to divide the numbers");
		
		try {
			result=a/b;
			
		}catch (Exception ex3) {
			System.out.println("Error received at division block");
			System.out.println(ex3.getStackTrace());
			System.out.println(ex3.getMessage());
		}
		finally {
			System.out.println("Finally block of code printed!!");
		}
		System.out.println("The result is "+result);
		
	}

}
