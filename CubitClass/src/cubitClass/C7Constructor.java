package cubitClass;
//constructors are used to edit attributes for a method which  can have multiple objects.

public class C7Constructor {
	// eg using mobile
	String brand = "Samsung";
	int price = 1200;

	public void info() {
		System.out.println("The " + brand + " phone has a price of $" + price);
	}

//All are constructors below. Having multiple constructors is called as constructor overload.
	public C7Constructor() {
		// initializing no argument constructor
	}

	public C7Constructor(String w, int u) {
		// initializing constructors in order
		price = u;
		brand = w;
	}

	public C7Constructor(int a) {
		// initializing single argument constructor without order
		price = a;
	}

	public C7Constructor(String b) {
		// initializing single argument constructor in order
		brand = b;
	}

	public C7Constructor(int x, String y) {
		// initializing constructors in order
		price = x;
		brand = y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C7Constructor m1 = new C7Constructor();
		m1.info();

		C7Constructor m2 = new C7Constructor(2000);
		m2.info();

		C7Constructor m3 = new C7Constructor("Iphone");
		m3.info();

		C7Constructor m4 = new C7Constructor(2000, "Xiaomi");
		m4.info();

		C7Constructor m5 = new C7Constructor("Huawei", 500);
		m5.info();

	}

}
