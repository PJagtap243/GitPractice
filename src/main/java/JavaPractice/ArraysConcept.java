package JavaPractice;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {

		int num[] = new int[4];
		num[0]=10;
		num[2]=50;
		num[3]=100;
	//	num[4]=55; // java.lang.ArrayIndexOutOfBoundsException
		
		int num1[] = {10, 25, 3};
		
		int num2[] = new int[] {15, 10, 55};
		
		for(int i: num1) {
			System.out.println(i);
		}
		
		System.out.println("-----------");
		
		for(int i = 0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println("-----------");
		System.out.println(Arrays.toString(num));
	}

}
