public class ArrayList3 implements Comparable<ArrayList3>{  //implements used to be able to use Collections.sort() on class
	private String name;    //made private for encapsulation, initiated getters and setters for accessing
	private int age;
	private String color;
	public ArrayList3() {
		super(); //doesn't make a difference even if not placed
	}
	public ArrayList3(String name, int age, String color) {
		super();
		this.name=name;
		this.age=age;
		this.color=color;
	}
	//can directly set getter and setter methods as well as toString method from source option//
	@Override
	public String toString() {
		return "ArrayList3 [name=" + name + ", age=" + age + ", color=" + color + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
//implementing unimplemented method of comparable interface
	@Override
	//public int compareTo(ArrayList3 obj2) {
		// Sorting logic below code in one line "return this.getAge()-obj2.getAge(), .age not used directly being private cls
//		if(this.getAge()>obj2.getAge()){
//			return -1;
//		}
//		else if(this.getAge()<obj2.getAge()) {
//			return 1;
//		}else {
//			return 0;
//		}
	//next code to sort based on name, String, as cant have two same methods so above commented out
	@Override
	public int compareTo(ArrayList3 obj2) {
		// Sorting logic
		return this.getName().compareTo(obj2.getName());	//or obj2.getName().compareTo(this.getName()) for decreasing order//
		}
	}

