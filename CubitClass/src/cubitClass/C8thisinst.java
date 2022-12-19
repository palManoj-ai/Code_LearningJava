package cubitClass;

public class C8thisinst {
	
	int x = 12;
	
	public void display() {
		int x=40;
		System.out.println(x);
		System.out.println(this); 
		System.out.println(this.x);   
	}
	C8thisinst(){
		System.out.println("This is unparameterized constructor of the class.");
	}
	C8thisinst(int a) {
		super();
		System.out.println("Inside of parameterized constructor.");
		this.x=a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		C8thisinst c1=new C8thisinst();
//		c1.display();
		C8thisinst c2=new C8thisinst(5);
		c2.display();

	}

}
