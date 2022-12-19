  package packageMaps;

import java.util.HashMap;
import java.util.Map;

public class newDemo_keychange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> map1=new HashMap<String,Integer>();
		String Str1=new String("rollno");
		Integer int1=20;
		
		map1.put(Str1,int1);
		System.out.println(Str1);              //rollno            
		System.out.println(Str1.hashCode());   //-925408514
		System.out.println(map1.hashCode());   //-925408534
		System.out.println(map1);              //{rollno=20}
		
		Str1="age";
		System.out.println("--------------");
		System.out.println(Str1);              //age
		System.out.println(Str1.hashCode());   //96511
		System.out.println(map1.hashCode());   //-925408534
		System.out.println(map1);              //{rollno=20}     //keys should not be changed in maps and if there is a need to 
		//update a key, use .remove() and then .put().
		System.out.println(map1.get("rollno"));
		System.out.println(map1.get("age"));
		
		Map<Integer,String> map2=new HashMap<Integer,String>();
		Integer no=400;
		map2.put(400, "Java");
		System.out.println("-------------");
		System.out.println(map2);
		System.out.println(map2.hashCode());
		no=1000;
		System.out.println(map2);
		System.out.println(map2.hashCode());
		
		
	}

}
