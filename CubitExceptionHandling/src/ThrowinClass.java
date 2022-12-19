public class ThrowinClass {

	public int divideNumbers(int d,int e) throws Exception{
		int number = d;
		int divisor= e;
		int result=0;
		try {
		if (divisor==0 && number==0) {
			Exception ex1=new Exception("Division of zeros: indeterminate value");
			throw ex1;
			
		}
		else if(divisor==0) {
			Exception ex=new Exception("Cant divide by zero");
			throw ex;
		}
		else {
			result=number/divisor;
			
		}
		}catch (Exception excep) {
			System.out.println(excep.getMessage());
		}
		return result;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int resultStore=0;
		ThrowinClass tc1 = new ThrowinClass();
		try{
			System.out.println(tc1.divideNumbers(0, 0));
		}catch (Exception exc) {
			System.out.println(exc.getMessage());
		}
//		System.out.println(tc1.divideNumbers(20, 5));
	}
}
