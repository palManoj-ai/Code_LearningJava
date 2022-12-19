package packageHashSet;
import java.util.HashSet;
import java.util.Set;


public class HashSet2Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Set<HashSet2Class> hset=new HashSet<HashSet2Class>();
		hset.add(new HashSet2Class("Google","Gregory",160));
		hset.add(new HashSet2Class("Meta","Alan",130));
		hset.add(new HashSet2Class("Google","Isakov",160));
		hset.add(new HashSet2Class("Google","Fyodor",160));
		hset.add(new HashSet2Class("Google","Fyodor",160));  //duplicate, is omitted
		hset.add(new HashSet2Class("Amazon","Sylvia",180));
		
		HashSet2Class objClass=new HashSet2Class("Netflix","Victor",140);
		hset.add(objClass);
		//Printing elements
//		System.out.println(hset);  prints out in [list]
		for (HashSet2Class c:hset) {
			System.out.println(c);			//OP is unordered, unsorted, and unique.
		}
		//Removing an object
		//have to pass the object name as the set is unordered so index doesn't work
		//and we can't access the object directly unless we have name of the object
		hset.remove(objClass); 
		System.out.println("----After removing-----\n\n");
		for (HashSet2Class c:hset) {
			System.out.println(c);			//OP is unordered, unsorted, and unique.
		}	
		//Checking .equals 
		HashSet2Class objClass2=new HashSet2Class("Netflix","Victor",140);
		hset.add(objClass2);
		//using object.equals method
		System.out.println("Objects Objclass and ObjClass2 are equal: "+objClass.equals(objClass2));
		//.contains 
		System.out.println("HashSet contains objClass2 "+hset.contains(objClass2)); 
		//OP is true because objclass2 even if not added is similar to objclass1 in the set
		//trying sort
//		Collections.sort(hset); not applicable to hash set
	}
}
