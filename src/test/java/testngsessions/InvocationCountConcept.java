package testngsessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {

	@Test (invocationCount = 10)
	public void m1Test() {
		System.out.println("M1 method..!");
	}
}
