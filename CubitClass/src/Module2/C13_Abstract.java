package Module2;

abstract class Dog{
   public void info() {
	   System.out.println("This is info module on Dog");
   }
   abstract public void woof();
}

class Pitbull extends Dog{
	public void woof() {
		System.out.println("Woof!");
	}
}

public class C13_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using parentclass");
//		Dog d=new Dog();  can't instantiate abstract class but can reference/inherit from only
//		d.info();
//		d.woof();
		
		System.out.println("Using childclass");
		Pitbull p=new Pitbull();
		p.info();
		p.woof();
	}

}
