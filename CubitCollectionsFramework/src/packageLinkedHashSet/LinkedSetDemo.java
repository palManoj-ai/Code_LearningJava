package packageLinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> lset=new LinkedHashSet<String>();
		
		lset.add("Hello");
		lset.add("Hotel");
		lset.add("Budapest");
		lset.add("Budapest");
		
		System.out.println(lset); 
		//OP is ORDERED, unique and unsorted   (REM HASHSET: unordered, unsorted, unique) 
				
		
	}
	

}
