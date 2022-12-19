package packageHashSet;
import java.util.HashSet;
import java.util.Set;

public class HashSetIntro {
	
	public static void main(String[] args) {
		//Hashset of character
		
		Set<Character> chset=new HashSet<Character>();
		chset.add('p');
		chset.add('a');
		chset.add('l');
		chset.add('l');
		System.out.println(chset);
		
		//Hashset of String
		Set<String> hset=new HashSet<String>();
		hset.add("mandalay");
		hset.add("robin");
		hset.add("margot");
		hset.add("mandalay"); //not added as no duplicates
		hset.add("gabriel");
		System.out.println(hset);
		//OP is unordered (not in the ip order), unique, and unsorted				
	}
}
