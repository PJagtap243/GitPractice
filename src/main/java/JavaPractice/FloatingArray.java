package JavaPractice;

public class FloatingArray {

	public static void main(String[] args) {
		
		float num1[] = {10, 20, 30}; // values are considered as double, if we specify decimal values it is 
									// giving type mismatch error
		
		
		for(float f: num1) {
			System.out.println(f);
		}
		
		System.out.println("------------");

		float num2[] = {10.2f, 14.0f, 15.22f};
		for(float f: num2) {
			System.out.println(f);
		}
	}

}
