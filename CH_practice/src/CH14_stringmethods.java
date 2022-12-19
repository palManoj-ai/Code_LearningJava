 
public class CH14_stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sc=new String("Manoj pal is here");
		System.out.println(sc.toUpperCase());
		System.out.println(sc.toLowerCase());
		String cutstr=sc.substring(0,5);
		System.out.println(cutstr);
		String untrim="    Hey there       ";
		System.out.println(untrim.trim());   //trims any leading and training whitespaces
		System.out.println(untrim.trim().replace("e", "i"));
		System.out.println(untrim.trim().replace("e", "iou")); //can also replace phrases eg er with es
		System.out.println(sc.startsWith("man")); //boolean checks if the string starts with Man. case sensitive
		System.out.println(sc.endsWith("er"));
		System.out.println(sc.charAt(4));
		System.out.println(sc.indexOf("j"));
		System.out.println(untrim.contains("the"));   //checks if the string contains "the", is case sensitive
	}
	

}
