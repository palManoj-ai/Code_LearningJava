package packageHashcode;

import java.util.Objects;

public class HC3Dog {
	
	String name;
	int age;
	public HC3Dog() {
		super();

	}
	public HC3Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//automatically generated hash code and equals method from source menu
	@Override 
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HC3Dog other = (HC3Dog) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	

}
