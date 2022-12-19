package packageMaps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHMapDemo1 {
	public static void main(String[] args) {
		
	Map<String,Integer> lhmap=new LinkedHashMap<String,Integer>();
	
	lhmap.put("Apple",100);
	lhmap.put("Guava",20);
	lhmap.put("Grapes",20);
	lhmap.put("Strawberry",50);
	lhmap.put("Apple",10);
	
	Integer x=lhmap.get("Apple");    //updated op 10
	
	System.out.println(lhmap.containsKey("Mango"));
	System.out.println(lhmap.size());

	for(Map.Entry<String, Integer> var: lhmap.entrySet()) {
		System.out.print("Key= "+var.getKey()+" , ");
		System.out.print("Value= "+var.getValue());
		System.out.println();                                       //OP is ordered, unsorted, and unique
		
	}
	
	
	}	
}
	

