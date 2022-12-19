package packageTreeSet;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;


public class TreeSet2Main {

	public static void main(String[] args) {
		// TODO

		TreeSet2Class ls1=new TreeSet2Class("Apple",5,0.5f);
		TreeSet2Class ls2=new TreeSet2Class("Strawberry",3,0.1f);
		TreeSet2Class ls3=new TreeSet2Class("Apple",5,0.5f); //duplicate
		
		Set<TreeSet2Class> tset=new TreeSet<TreeSet2Class>();
		
		tset.add(new TreeSet2Class("Cherry",3,0.2f));
		tset.add(ls1);
		tset.add(ls2);
		tset.add(ls3);
		
		System.out.println(tset); //op is sorted default by name, ie first attribute, unordered,unique
		
		//Sorting by use of collections.sort method
		
		Collections.sort(tset);
		
		
		
		

		
		

	}

}
