package packageLinkedHashSet;


public class DemoDogHashset {
 // or public class DemoDogHashset extends Object in above line, doesn't make a difference
	String type;
	int age;
	
	void bark() {
		System.out.println("Woof!!");

	}
	public DemoDogHashset() {
		super();
	}
	public DemoDogHashset(String type, int age) {
		super();
		this.type = type;
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "DemoDogHashset [type=" + type + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return type.hashCode()+age;   //hashcode of class as sum of hashcode of string, got by .hashcode() and int itself.(code=int)
	}
	@Override
	public boolean equals(Object obj) {
		DemoDogHashset classObject=(DemoDogHashset)(obj);  //downcasting object obj to class type here DemoDogHashset
		if( this.age==classObject.age && this.getType().equals(classObject.getType())) { //content comparison
			return true;
		}
		return false;
	}
	
	
	

}
