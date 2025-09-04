package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionsConcept {

	@Test (expectedExceptions = ArithmeticException.class)
	public void m1Test() {
		System.out.println("M1 method..!");
		int i = 20/0;
	}
}
