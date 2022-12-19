
class Employee {
	public int salary = 9000;
	public String name = "Mandy";

	public void info() {
		System.out.println("Default attributes are: \nName: " + name + "\nSalay: " + salary);
	}

	public void setName(String nameholder) {
		name = nameholder;
	}

	public String getName() {
		return name;
	}

	public void setSalary(int salaryholder) {
		salary = salaryholder;
	}

	public int getSalary() {
		return salary;
	}
}

public class CH40_GettersSetters {

	public static void main(String[] args) {
		Employee mandy = new Employee();
		// System.out.println(mandy.salary);
		// System.out.println(mandy.name);
		/*
		 * Above code will o/p employee.salary which is not visible, because of "public" modifier 
		 * doing so enhances security as access to variables directly can affect entire program 
		 * so instead we use getters and setters, which are methods that help access/modify the attributes
		 */
		mandy.setName("Manoj Pal");
		System.out.println("The name is " + mandy.getName());
		mandy.setSalary(12000);
		System.out.println("The salary is USD " + mandy.getSalary());

	}

}
