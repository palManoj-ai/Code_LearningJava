
import java.text.DecimalFormat;
public class CHdecimal {

	public static void main(String[] args) {
		// Ways to convert to nth decimal eg for 2 decimal 3.1575 becomes 3.16
		float num=3.135673f;
//		first way by format method, but doesnt let you store the number to a variable
//        System.out.format("The number rounded to 2 decimal places is "+ "%.2f"+"\n", num);
//        using format method from print statement
        System.out.printf("The number after being rounded two decimals is %.2f",num);
//      second way by the decimal format class, here creating a 3 decimal format
        DecimalFormat dnew=new DecimalFormat("#.###");
        System.out.println("By second method, the number rounded to 3 decimal places is "+dnew.format(num));
// 		FIND A WAY TO ROUNDOFF AND STORE NUMBER TO A VARIABLE
//      FLOOR AND CEILING METHOD OF ROUNDING
//        System.out.println("By round method the value is "+Math.round(num));
	}

}
