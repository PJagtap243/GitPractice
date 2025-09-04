package JavaPractice;

import java.util.Arrays;

public class ObjectArray {

	public static void main(String[] args) {
		Object[] obj1 = new Object[4];
		obj1[0] = 10;
		obj1[1] = 10.22;
		obj1[2] = "Hello";
		//obj1[3] = true;
		
		for(Object o : obj1) {
			System.out.println(o);
		}
		
		System.out.println(Arrays.asList(obj1));
		obj1[2] = 'A';
		System.out.println(Arrays.asList(obj1));
		
		System.out.println("----------------");
		
		Object [] obj2 = {1, "TOM", "Male", 18};
		for(Object o : obj2) {
			System.out.println(o);
		}
	}

}
