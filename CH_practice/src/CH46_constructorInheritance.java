
class ParentCls{
	//defining constructors for base class
	ParentCls(){
		System.out.println("This is base class public constructor");
	}
	ParentCls(int x){
		System.out.println("This is base class constructor with value of x as: "+x);
	}
}

class DerivedCls1 extends ParentCls{
	//defining constructors for base class
	DerivedCls1(){
		System.out.println("This is child class 1 public constructor");
	}
	DerivedCls1(int x, int y){
		super(x);
		System.out.println("This is child class 1 constructor with value of y as "+y);
	}
}

class DerivedCls2 extends DerivedCls1{
	//defining constructors for base class
	DerivedCls2(){
		System.out.println("This is child class 2 public constructor");
	}
	DerivedCls2(int x, int y, int z){
		super(x,y);
		System.out.println("This is child class 2 constructor with value of z as "+z);
	}
}



public class CH46_constructorInheritance {

	public static void main(String[] args) {
		// Instantiating all classes
//		ParentCls pc=new ParentCls();
//		ParentCls pc=new ParentCls(5);
//		DerivedCls1 dc1=new DerivedCls1();
//		DerivedCls1 dc1=new DerivedCls1(2,7);
//		DerivedCls2 dc2=new DerivedCls2();
		DerivedCls2 dc2=new DerivedCls2(5,2,9);

	}

}
