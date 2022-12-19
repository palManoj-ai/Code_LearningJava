package packageLinkedHashSet;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSet2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<LinkedSet2Class> lset=new LinkedHashSet<LinkedSet2Class>();
		
		LinkedSet2Class ls1=new LinkedSet2Class("Apple",5,0.5f);
		LinkedSet2Class ls2=new LinkedSet2Class("Strawberry",3,0.1f);
		LinkedSet2Class ls3=new LinkedSet2Class("Apple",5,0.5f); //duplicate
		
		lset.add(new LinkedSet2Class("Cherry",3,0.2f));
		lset.add(ls1);
		lset.add(ls2);
		lset.add(ls3);
		
		Iterator<LinkedSet2Class> it=lset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//		O/P is ordered, unsorted, and unique.		
		
//		Collections.sort(lset);, not applicable unless you change it to arraylist or treeset
		
		System.out.println(ls1.equals(ls3)); //true, rem it is a method of the object not hashset
		System.out.println(lset.contains(ls3)); //true 
		
	}

}
