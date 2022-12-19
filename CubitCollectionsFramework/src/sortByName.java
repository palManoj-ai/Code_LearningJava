import java.util.Comparator;

public class sortByName implements Comparator<ArrayList4Comparator> {
//in above line <classname> shoud be added
	@Override
	public int compare(ArrayList4Comparator o1, ArrayList4Comparator o2) {
		//in above line, by default object o1 and o2, change to classname o1, classname o2
		// Sorting logic based on say state in ascending order as o1.o2 is compared
		int x=o1.getState().compareTo(o2.getState());
		return x;
	}

}
