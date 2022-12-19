import java.util.Scanner;

public class C22Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your name!!");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		sc.close();
		try {
			if (name=="isha") {
				Exception e=new Exception("You are not authorized.");
				throw e;
			}
		} catch(Exception e) {
			System.out.println("Exception: ");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally block printed");
		}
		System.out.println("Hello "+name);
		System.out.println("End of program");
		
	}

}
