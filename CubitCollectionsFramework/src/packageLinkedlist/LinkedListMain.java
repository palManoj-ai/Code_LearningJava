
package packageLinkedlist;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class LinkedListMain {

	public static void main(String[] args) {
		// Creating linked list
		List<LinkedListDemo> llist=new LinkedList<LinkedListDemo>();
		llist.add(new LinkedListDemo("Manmohan","Apple",200));
		llist.add(new LinkedListDemo("Saroj","Google",160));
		llist.add(new LinkedListDemo("Anup","IBM",210));
		llist.add(new LinkedListDemo("Zarina","Oracle",160));
		
		String[] nameArray= new String[]{"Hari", "Shyam", "Yogen","Qasim","Atul","Rishi","Suman"};
		String[] companyArray= new String[]{"Microsoft", "Tesla", "Amazon","BOA","Boeing","SolarWinds","Alpha"};
		int[] salaryArray=new int[] {150, 198,98,140,120,140,99};
		
		
		//creating Arraylist of same
		List<LinkedListDemo> alist=new ArrayList<LinkedListDemo>();
		alist.add(new LinkedListDemo("Manmohan","Apple",200));
		alist.add(new LinkedListDemo("Saroj","Google",160));
		alist.add(new LinkedListDemo("Anup","IBM",210));
		alist.add(new LinkedListDemo("Zarina","Oracle",160));
		
		float startLL1=System.currentTimeMillis();
		
		for (int i=0;i<nameArray.length;i++) {
			llist.add(new LinkedListDemo((String)nameArray[i],(String)companyArray[i],(int)salaryArray[i]));
		}
		
		float endLL1=System.currentTimeMillis();
		
		float startAL1=System.currentTimeMillis();
		for (int j=0;j<nameArray.length;j++) {
			alist.add(new LinkedListDemo((String)nameArray[j],(String)companyArray[j],(int)salaryArray[j]));
		}
		
		float endAL1=System.currentTimeMillis();
		
		System.out.println("Time with LinkedList: end in "+ endLL1 +"start at"+ startLL1 +" , total time: "+ (float)(endLL1-startLL1) +" ms");
		System.out.println("Time with ArrayList: end in "+endAL1+"start at"+startAL1+" , total time: "+ (float)(endLL1-startLL1)+" ms.");
		
		double startLL=System.currentTimeMillis();
		for (LinkedListDemo object:llist) {
			System.out.println(object.toString());
		}
		double endLL=System.currentTimeMillis();
		System.out.println("Time used up by loop with LinkedList: "+(endLL-startLL)+" ms.");
		double startAL=System.currentTimeMillis();
		for (LinkedListDemo object2:alist) {
			System.out.println(object2.toString());
		}
		double endAL=System.currentTimeMillis();
		System.out.println("Time used up by loop with ArrayList: "+(endAL-startAL)+" ms.");

	}

}
