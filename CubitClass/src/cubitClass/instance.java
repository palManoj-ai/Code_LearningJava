package cubitClass;

public class instance {

//attribute name of the object or instance variable
	String color= "red";
	int num = 4;
	public instance() {
	}
	public instance(String color, int num) {
		
		this.color = color; // this refers to the attribute - so here local variables are going to the
							// instance variable
		this.num = num;
	}
	
	public void show() {
		String color = "green";
		System.out.println(this);
		System.out.println(color);
		System.out.println(this.color);
		System.out.println(num);
		System.out.println(this.num);
		
	}
	public static void main(String[] args) {
		instance gg = new instance();
		gg.show();
		System.out.println("***************************");
		instance gg1 = new instance("purple", 7);
		gg1.show();
		
	//System.out.println(gg1.color);
		
		
	}
}