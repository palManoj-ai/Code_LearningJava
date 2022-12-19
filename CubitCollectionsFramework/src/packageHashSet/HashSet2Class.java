package packageHashSet;

import java.util.Objects;

public class HashSet2Class{
	
	private String name;
	private String company;
	private int salary;
	
	
	//constructor 
	public HashSet2Class(String company, String name, int salary) {
		super();
		this.name = name;
		this.company = company;
		this.salary = salary;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	@Override
	public String toString() {
		return "HashSet2 [name=" + name + ", company=" + company + ", salary=" + salary + "]";
	}


	//Now overriding .equals and hashCode methods from source menu
	
	@Override
	public int hashCode() {
		return Objects.hash(company, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashSet2Class other = (HashSet2Class) obj;
		return Objects.equals(company, other.company) && Objects.equals(name, other.name) && salary == other.salary;
	}

	
	
	
	
}
