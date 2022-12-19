package cubitClass;

public class HW2 {

	public static void main(String[] args) {
		// hw2 search for a given value
		int listarry[] = new int[] { 2, 5, 8, 12, 15, 40 };
		int numb = 8;
		for (int i = 0; i < listarry.length; i++) {
			if (numb == listarry[i]) {
				System.out.println("Number " + listarry[i] + " is found");
			}
		}
	}
}
