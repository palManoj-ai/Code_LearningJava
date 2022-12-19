import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListdemo1 {
//More methods https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers=new ArrayList<Integer>();
		List<Integer> numbers2=new ArrayList<Integer>(2); //2 sets the initial capacity, to increase ensureCapacity()
		//adding elements to the array list
		numbers.add(402);
		numbers.add(403);
		numbers.add(401);
		numbers2.add(388);
		numbers2.add(399);
		//demo of methods for array list
		System.out.println("The numbers araylist has a size of "+numbers.size());
		System.out.println("403 is located at index: "+numbers.indexOf(403)); //throws -ve if element isnot present
		System.out.println("Does the list contain 405? "+numbers.contains(405));
		//adding item later
		numbers.add(406);
		//setting elements based on index
		numbers.set(3,404);
		//adding collections numbers2 to numbers1
		numbers.addAll(numbers2); //if index 0 had been placed appends at start
		System.out.println("The size of the resulting collectino is "+numbers.size());
		//.clear() method purges all data in a collection
		//sorting the array
		Collections.sort(numbers);
		System.out.println("List after sorting is"+numbers);	
	}
	}

