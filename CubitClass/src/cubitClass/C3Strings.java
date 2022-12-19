
package cubitClass;
import java.util.*;

public class C3Strings {
	public static void main(String[] args) {
		// Strings and user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name!");
		String namestore=sc.nextLine();
	    int len=namestore.length();
	    sc.close();
	    for (int i=0;i<len;i++) {
	    	System.out.println(namestore.charAt(i));
	    }
	    System.out.println("Name in Uppercase is "+namestore.toUpperCase());
	    //String reversal new method
	    String reversed="";
	    for (int i=0;i<namestore.length();i++) {
	    	reversed=reversed+namestore.charAt(i);
	    }
	    System.out.println("Reversed name is "+reversed);
	    //Counting no of vowels and alphabets
	    
	}

}
