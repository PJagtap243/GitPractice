package JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDeclaration {

	public static void main(String[] args) {
		
		// Raw Arraylist
		ArrayList al = new ArrayList();
		
		// ArrayList with genetics
		ArrayList<String> al1 = new ArrayList<String>();
		
		// ArrayList with initial virtual capacity as 20
		ArrayList<String> al2 = new ArrayList<String>(20);
		
		// ArrayList with initial values
		ArrayList<Integer> al3 = new ArrayList<Integer>(Arrays.asList(10, 20, 30));
		System.out.println(al3);
	}

}
