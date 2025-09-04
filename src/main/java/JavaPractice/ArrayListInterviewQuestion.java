package JavaPractice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayListInterviewQuestion {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("TOM");
		al.add("Peter");
		al.add("Holand");
		al.add("Robert");
		al.add("Peter");
		al.add("Holand");
		
		System.out.println(al);
		
		//Remove duplicates using loop
		ArrayList<String> al1 = new ArrayList<String>();
		
		for(String s : al) {
			if(!al1.contains(s)) {
				al1.add(s);
			}
		}
		System.out.println(al1);
		
		//Remove duplicates using LinkedHashSet
		
		Set<String> s = new LinkedHashSet<String>(al);
		al.clear();
		al.addAll(s);
		System.out.println(al);
	}
	

}
