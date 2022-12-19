import java.util.Scanner;

public class CHuserinput {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first integer no");
		int a=sc.nextInt();
		//to check if the no is int. or not, use sc.hasNextInt()
		System.out.println("Enter second float no");
		float b=sc.nextFloat();
		System.out.println("Enter your name");
		String str=sc.nextLine();
		str=str.toUpperCase();
		sc.close();
		float sum=a+b;
		System.out.println("Hi "+str+", The sum of the numbers is "+sum);
	}
}
