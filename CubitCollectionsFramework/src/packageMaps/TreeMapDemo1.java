package packageMaps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		// Same as HashMap and LinkedHashMap only difference is it is sorted by default, and must implement comparable/tor
		
		Map<String,Integer> tmap=new TreeMap<String,Integer>();
		
		tmap.put("Apple",100);
		tmap.put("Guava",20);
		tmap.put("Grapes",20);
		tmap.put("Strawberry",50);
		tmap.put("Apple",10);
		
		Integer x=tmap.get("Apple");    //updated op 10
		System.out.println(x);
		
		System.out.println(tmap.containsKey("Mango"));
		System.out.println(tmap.size());

		for(Map.Entry<String, Integer> var: tmap.entrySet()) {
			System.out.print("Key= "+var.getKey()+" , ");
			System.out.print("Value= "+var.getValue());
			System.out.println();                              //OP sorted by ascending order,can we change it?
		
	}
}
}
