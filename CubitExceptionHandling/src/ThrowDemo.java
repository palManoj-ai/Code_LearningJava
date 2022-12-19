import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO: Simple authorization checker
		Scanner sc = new Scanner(System.in);
		String optionSelected = "Default";
		while (optionSelected != "p@ssw0rd") {
			System.out.println("Enter your password!!");
			String password = sc.nextLine();
			try {
				if (password.equals("p@ssw0rd")) {
					System.out.println("Password Matches!, Welcome back");
					sc.close();
					break;
					
				} else {
					//defining custom exception message to throw
					Exception exception = new Exception("Wrong password entered. please retry!");
					throw exception;
					// break;
				}
			} catch (Exception exception) {
				System.out.println("Exception encountered..");
				System.out.println(exception.getMessage());
			}
		}
		System.out.println("End line of program");
//		String name="m@n0j";
//		System.out.println(name!="m@n0j");
	}
}
