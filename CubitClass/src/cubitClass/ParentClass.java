package cubitClass;

public class ParentClass {
	public void m1() {
		System.out.println("Im in m1 method of parent\n\t");
	}

	public static void main(String[] args) {
		// Using instances of class to call methods
		ParentClass pc=new ParentClass();
		pc.m1();
//		pc.m2(); not defined
		ChildClass cc=new ChildClass();
//		cc.m1();
		cc.m2();
	}
	}
	class ChildClass extends ParentClass{
//		overwriting method m1
		public void m1() {
			System.out.println("Im in m1 method of child");
		}
		public void m2() {
			System.out.println("\tIm in m2 method of child");
		}
	}
	

