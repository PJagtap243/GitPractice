package JavaPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("TOM");
		al.add("Peter");
		al.add("Holand");
		al.add("Robert");
		
		System.out.println(al);
		
		//
		al.add(2, "John");
		System.out.println(al);
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Pink");
		al1.add("Red");
		al1.add("Orange");
		
		System.out.println(al1);
		
		System.out.println("----------------");
		System.out.println(al.addAll(4, al1));
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);

	}
}
