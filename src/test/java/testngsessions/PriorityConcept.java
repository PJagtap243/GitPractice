package testngsessions;

import org.testng.annotations.Test;

public class PriorityConcept {
	
	//1. Pririty can be -ve as well.
	//2. Pririty must be int only.
	//3. default priority is 0.
	//4. if priroty is not specified, test cases will execute in alphabetical order.
	//5. if same priority is given to multiple test cases, test executed in alphabetical order.

	@Test (priority = 2)
	public void m1Test() {
		System.out.println("M1 method..!");
	}
	
	@Test (priority = 1)
	public void m2Test() {
		System.out.println("M2 method..!");
	}
}
