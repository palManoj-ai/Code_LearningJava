package cubitClass;
public class C4Methods {

  static void added(int num1, int num2){
	  int z=num1+num2;
	  System.out.println(z);
}
  
  static int subt(int num3, int num4){
	  int y=num3-num4;
	  return(y);
}
 
	public static void main(String[] args) {
		// Methods
		System.out.println("Printing directly from void method");
		added(4,5);
		System.out.println("Returning the value of method and assigning");
		//assigning result of subt method to variable m
		int m=subt(9,2);
		//secondary step calculation, could be anything say in a large step computation
		m=m*5;
		System.out.println(m);
	}
}
