package cubitClass;

public class HWC7car {

	String color = "";
	int wheels = 0;
	int model = 0;

	public HWC7car(String x) {
		// constructor with color only
		color = x;
	}

	public static void main(String[] args) {
		// main method

		HWC7car c1 = new HWC7car("red");
		System.out.println(c1.color);

	}

}
