package packageHashcode;
public class HashCodeDemo {
	public static void main(String[] args) {
		String name="manoj";
		String name2="manoj";   //both have same hash code
		Integer num=103662773;  //using hash code of name
		String num2="103662773"; 		
		System.out.println("The hashcode of the variable name is: "+name.hashCode()); //103662773
		System.out.println("The hashcode of the variable name2 is: "+name2.hashCode()); //103662773
		System.out.println("The hashcode of the variable num is: "+num.hashCode()); // 103662773
		System.out.println("The hashcode of the variable num2 is: "+num2.hashCode());  //-999969387 different as integer/string
		//if the hash code is stored in a variable, then the hashcode of the variable is also the number/hash code itself.
		
		//checking .equals and == 
		System.out.println(name.equals(name2)); //true
		System.out.println(name==name2);        //true
		//both o/p will be true because of the way variables were initialized; 
		// even if a string is assigned to multiple variables, java will allocate a single memory location and will point
		//the two variables to the location so its the same hence..
		//.equals 	
		String string1=new String("hello");
		String string2=new String("hello");
		System.out.println("string1 == string2 is "+(string1==string2));
		System.out.println("By .equals method "+ string1.equals(string2));
		System.out.println("The hashcode of the string1 is: "+string1.hashCode());
		System.out.println("The hashcode of the string2 is: "+string2.hashCode());
	}
}
