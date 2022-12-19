package HashMapsWithObj;

import java.util.HashMap;
import java.util.Map;

public class Main_HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Employee,Company> hmap=new HashMap<Employee,Company>();
		Employee e1=new Employee("Freddy",5);
		Employee e2=new Employee("John",7);
		Company c1=new Company("Google",120);
		Company c2=new Company("Facebook",110);
		
		hmap.put(e1,c1);
		hmap.put(e2 ,c2);
		
		hmap.get(e2);
		hmap.values();
		
		

	}

}
