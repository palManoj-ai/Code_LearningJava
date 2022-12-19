package packageHashcode;

class Dog{
	String name="default";
	int age=1;
	
	Dog(String name, int age){
		this.name=name;
		this.age=age;
	}
}

public class equalsAndOp {
	public static void main(String[] args) {
		
	
	String str1=new String("manoj");
	String str2=new String("manoj");

	System.out.println(str1==str2);   //false
	System.out.println(str1.equals(str2)); //true
	
	Dog d1=new Dog("Pug",5);
	Dog d2=new Dog("Pug",5);   //even though it has same content, the name is different so 
	Dog d3=new Dog("Shepherd",4);
	
	System.out.println(d1==d2);   //false because == is on
	
	
}
}
