package cubitClass;

class CinheritanceParent {
	void info() {
		System.out.println("Hi this is info module on parent class");
	}

	void call() {
		System.out.println("Call method on parent class");
	}
}
	
// Inheriting from parent class and adding a text method		
class Cchildclass extends CinheritanceParent {

	public void text() {
		System.out.println("Text method on childclass");
	}
}

public class C10inheritanceParent {
	public static void main(String[] args) {
		Cchildclass c1 = new Cchildclass();
		c1.info();
		c1.text();
		c1.call();
	}
}


