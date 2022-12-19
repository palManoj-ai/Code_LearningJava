import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Demo3Main {
	public static void main(String[] args) {
		// defining a new array list that has objects of type ArrayList
		List<ArrayList3> alist = new ArrayList<ArrayList3>();
		// Creating objects of class Arraylist3 through parameterized constructors
		ArrayList3 list1 = new ArrayList3("Manoj", 421, "blue");
		ArrayList3 list2 = new ArrayList3("Hari", 420, "green");
		ArrayList3 list3 = new ArrayList3("Prakash", 423, "yellow");
		ArrayList3 list4 = new ArrayList3("Omkar", 424, "brown");
		alist.add(list1);
		alist.add(list2);
		alist.add(list3);
		alist.add(list4);
		// we can also add by directly defining the objects in the add method of the array list
		alist.add(new ArrayList3("Yogesh", 399, "maroon"));
		alist.add(new ArrayList3("Suresh", 327, "teal"));
		// printing classes in the list using iterator
		Iterator<ArrayList3> it = alist.iterator();
//		while (it.hasNext()) {
//			ArrayList3 al = it.next();
//			System.out.println(al);
//		}
		//To sort the array list using Collections.sort which uses comparable interface
		Collections.sort(alist); 
		//using this will only give error as objects are not comparable unless you implement it in the class ArrayList
		System.out.println("Printing after sorting based on name");
		for (ArrayList3 object:alist) {
			System.out.println(object);			
		}	
	}
}
