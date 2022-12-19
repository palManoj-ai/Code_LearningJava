package packageMaps;
import java.util.HashMap;
import java.util.Map;

public class HashMapdemo1 {

	public static void main(String[] args) {
		// HashMap: unordered, unsorted
		
		Map<String,Integer> hmap2=new HashMap<String,Integer>();
		
		hmap2.put("Key1",200);
		hmap2.put("Key2",120);
		hmap2.put("Key3",140);
		hmap2.put("Key1",100);   //changing 

		System.out.println(hmap2);   //{Key2=300, Key1=100, Key3=400} op is ordered, unsorted
		
		System.out.println(hmap2.get("Key1"));                          //value of key1-->100
		Integer x=hmap2.get("Key1");                             //as key2 value, though a no,is stored as an object so Integer cls
		System.out.println(x+10);                               //110 op so can do arithmetic operations as well/which is better?
		System.out.println(hmap2.containsKey("Key3"));			//true as Key3 is present
		System.out.println(hmap2.containsValue(140));            //true as value list contains 140
		
//		System.out.println(hmap.entrySet());  iterable list of the keys and values and to access them 
		//To iterate through the elements and get the value and key name
		for(Map.Entry<String, Integer> var : hmap2.entrySet()) {
			System.out.print("Key= "+var.getKey()+" , ");
			System.out.print("Value= "+var.getValue());
			System.out.println();
		}			
	}
}


