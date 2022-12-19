
import java.util.Scanner;
public class PracticeString {

	public static void main(String[] args) {
		// WAP to convert string spaces with underscore eg Manoj Pal gets converted to Manoj_Pal
		//String str="Manoj Pal";
		//str=str.replace(" ","_");
		//System.out.println(str);
		// WAP to replace name in a string
//		String str1="Hi <|name|>, thank you for your time"; // <|name|> done so that while replacing only this gets modified
//		str1=str1.replace("<|name|>","Harry");
//		System.out.println(str1);
		//WAP to detect double and triple spaces in a string
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string you want to check");
		String strg=scanner.nextLine();
//		String strg="Me  thinks   that it is possible!";
		//strg.contains("  " || "   ");, this isnt possible as or operator isnt supported by contains method of string
		if (strg.indexOf("  ")>0 && strg.indexOf("   ")>0) {
			System.out.println("Double and triple space detected");
		}
			else if (strg.indexOf("  ")>0){
				System.out.println("Double space detected");
			}
			else if (strg.indexOf("   ")>0){
				System.out.println("Triple space detected");
			}
			else {
					System.out.println("No double and triple space detected");
				}
		scanner.close();
		//next method by indexof
//		System.out.println(strg.indexOf("  "));  //if +ve, index of double space
//		System.out.println(strg.indexOf("   ")); //if -ve, index of triple space
		
			}
}
