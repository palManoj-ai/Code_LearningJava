package cubitClass;
import java.util.Scanner;
public class CWC3Method {
	static int greatest(int a, int b, int c) {
		if ((a>b) && (a>c)) {
		return (a);
		}
		else if ((b>c) && (b>a)){
		return (b);	
		}
		else {
		return (c);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int x = sc.nextInt();
		System.out.println("Enter second number");
		int y = sc.nextInt();
		System.out.println("Enter third number");
		int z = sc.nextInt();
		sc.close();
		int greatno = greatest(x, y, z);
		System.out.println("The largest no is " + greatno);
	}
}
