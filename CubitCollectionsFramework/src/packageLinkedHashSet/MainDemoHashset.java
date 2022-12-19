package packageLinkedHashSet;

import java.util.HashSet;
import java.util.Set;

public class MainDemoHashset {

	public static void main(String[] args) {
		// Demonstrate if double objects are allowed in hashset or not.
		
		DemoDogHashset dg1=new DemoDogHashset("Lab", 3);
		DemoDogHashset dg2=new DemoDogHashset("German Shepherd", 4);
		DemoDogHashset dg3=new DemoDogHashset("Lab", 3);                //duplicate object
		
		Set<DemoDogHashset> dogSet=new HashSet<DemoDogHashset>();
		dogSet.add(dg1);
		dogSet.add(dg2);
		dogSet.add(dg3);

		System.out.println(dogSet);
		System.out.println(dg1.equals(dg3)) ;    //no duplicate objects after overriding the .hashCode() method 
		
	}
}
