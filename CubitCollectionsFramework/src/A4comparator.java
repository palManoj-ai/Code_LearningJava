import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A4comparator {

	public static void main(String[] args) {
		List<ArrayList4Comparator> alistcomp = new ArrayList<ArrayList4Comparator>();
		// Creating objects of class Arraylist3 through parameterized constructors
		ArrayList4Comparator list1 = new ArrayList4Comparator("Manoj", 421, "Virginia");
		ArrayList4Comparator list2 = new ArrayList4Comparator("Hari", 420, "Texas");
		ArrayList4Comparator list3 = new ArrayList4Comparator("Prakash", 423, "California");
		ArrayList4Comparator list4 = new ArrayList4Comparator("Omkar", 424, "Colorado");
		alistcomp.add(list1);
		alistcomp.add(list2);
		alistcomp.add(list3);
		alistcomp.add(list4);
		// we can also add by directly defining the objects in the add method of the array list
		alistcomp.add(new ArrayList4Comparator("Yogesh", 399, "Arkansas"));
		alistcomp.add(new ArrayList4Comparator("Suresh", 327, "Tennesse"));
		
		//To sort the array list using Collections.sort(list,comparator class);
		//will be prompted to create the class in same package
		Collections.sort(alistcomp, new sortByName());
		System.out.println("Printing after sorting based on state in ascending order");
		
		for (ArrayList4Comparator object:alistcomp) {
			System.out.println(object);			
		}	
	}
}

