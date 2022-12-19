package packageTreeSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet1{

	public static void main(String[] args) {
//		TreeSet<Character> tset=new TreeSet<Character>(); Default sort
		TreeSet<Character> tset=new TreeSet<Character>(new Comparator<Character>() {
		public int compare(Character c1,Character c2) {
			return c2.compareTo(c1);
		}
	});     //note the }); placement, inside an anonymous class			
		Character c1='a';
		Character c2='p';
		Character c3='p';
		tset.add(c1);
		tset.add(c2);
		tset.add(c3);
		tset.add('l');
		tset.add('e');
		Iterator<Character> it=tset.iterator();   ////iterator to print each Character object 
		while(it.hasNext()) {
			System.out.println(it.next());      // [a,e,l,p] default, [p,l,e,a] as descending.  
		}
		//Tree set of Integer object
		Set<Integer> intset=new TreeSet<Integer>(new Comparator<Integer>() {
			public int compare(Integer i1 , Integer i2) {
				return i2.compareTo(i1);
			}
		});
		int[] phoneNo=new int[] {7,3,7,4,2,0,8};
		for(int x:phoneNo) {
			intset.add(x);
		}
		System.out.println("-----------------");
		System.out.println(intset);             //OP is [8, 7, 4, 3, 2, 0], : default [0,2,3,4,7,8] 		
}
}