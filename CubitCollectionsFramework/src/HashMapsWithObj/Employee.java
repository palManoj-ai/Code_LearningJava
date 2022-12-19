package HashMapsWithObj;

import java.util.Objects;

public class Employee {
	String name;
	int experience;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", experience=" + experience + "]";
	}
	public Employee() {
		
	}
	
	public Employee(String name, int experience) {
		super();
		this.name = name;
		this.experience = experience;
	}
	@Override
	public int hashCode() {
		return Objects.hash(experience, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return experience == other.experience && Objects.equals(name, other.name);
	}
	
	

}
