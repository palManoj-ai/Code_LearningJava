package HashMapsWithObj;

import java.util.Objects;

public class Company {
	
	String desiredCompany;
	int desiredSalary;
	public String getDesiredCompany() {
		return desiredCompany;
	}
	public void setDesiredCompany(String desiredCompany) {
		this.desiredCompany = desiredCompany;
	}
	public int getDesiredSalary() {
		return desiredSalary;
	}
	public void setDesiredSalary(int desiredSalary) {
		this.desiredSalary = desiredSalary;
	}
	@Override
	public String toString() {
		return "Company [desiredCompany=" + desiredCompany + ", desiredSalary=" + desiredSalary + "]";
	}
	public Company() {
		
	}
	public Company(String desiredCompany, int desiredSalary) {
		super();
		this.desiredCompany = desiredCompany;
		this.desiredSalary = desiredSalary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(desiredCompany, desiredSalary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		return Objects.equals(desiredCompany, other.desiredCompany) && desiredSalary == other.desiredSalary;
	}
	
	
	

}
