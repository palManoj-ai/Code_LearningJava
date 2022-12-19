
public class ArrayList4Comparator {
	private String name;    
	private int age;
	private String state;
	public ArrayList4Comparator() {
		super(); 
	}
	public ArrayList4Comparator(String name, int age, String color) {
		super();
		this.name=name;
		this.age=age;
		this.state=color;
	}
	//can directly set getter and setter methods as well as toString method from source option//
	@Override
	public String toString() {
		return "ArrayList4Comparator [name=" + name + ", age=" + age + ", state=" + state + "]";
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	}


