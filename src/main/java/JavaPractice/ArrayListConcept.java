package JavaPractice;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(10.5);
		al.add("Hello");
		al.add(true);
		
		System.out.println(al); // to get all elements
		System.out.println(al.get(3)); //to get specific element
		//System.out.println(al.get(5)); //  java.lang.IndexOutOfBoundsException
		
		System.out.println("------------");
		
		for(Object e : al) {
			System.out.println(e);
		}
		System.out.println("------------");
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
	}

}
