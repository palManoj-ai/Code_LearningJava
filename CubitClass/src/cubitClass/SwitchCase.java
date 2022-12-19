package cubitClass;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// Print day based on number of day
		
		int numDay;
		String day;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the day number!!");
		numDay=scanner.nextInt();
		scanner.close();	
		switch (numDay) {
		case 1:
			day="Sunday";
			break;
			//break takes out of loop, if not used prints all following statements following a matching case
		case 2:
			day="Monday";
			break;
		case 3:
			day="Tueday";
			break;
		case 4:
			day="Wednesday";
			break;
		case 5:
			day="Thursday";
			break;
		case 6:
			day="Friday";
			break;
		case 7:
			day="Saturday";
			break;
		//default case
		default:
			day="Invalid day selected, Try again!!";
		}
		System.out.println("Day corrensponding to number is "+day);
		}
	}


