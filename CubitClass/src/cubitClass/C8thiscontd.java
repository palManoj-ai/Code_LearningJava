package cubitClass;

public class C8thiscontd {
	
	//instance variable
	int age=25;
	
	public void info() {
		//info method for class that displays information
		int age=30;
		System.out.println("Age value by calling directly is "+age);
		System.out.println("Age value with this instance is "+this.age);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C8thiscontd c1=new C8thiscontd();
		c1.info();

	}

}
