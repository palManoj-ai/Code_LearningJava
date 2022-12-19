package cubitClass;

public class C6CWmobile {
	
	//Create an mobile and change its price for different users. Use 3 attributes and 2 behaviors of the mobile
	  
	String color="";
	String brand="";
	int price=0;
	
	void game() {
		System.out.println("Game setup initializing");
	}

	
	public static void main(String[] args) {
		C6CWmobile u1=new C6CWmobile();
		C6CWmobile u2=new C6CWmobile();
		
		u1.color="obsidian";
		u1.brand="iphone";
		u1.price=1160;
		
		u2.color="white";
		u1.brand="samsung";
		u1.price=800;
		
		System.out.println("First phone is"+u1.color+ u1.brand+"priced at"+u1.price);
		
		
		
		
	}

}
