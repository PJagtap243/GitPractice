package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite method");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass method");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod method");
	}

	@Test
	public void m1Test() {
		System.out.println("M1 method..!");
	}
	
	@Test
	public void m2Test() {
		System.out.println("M2 method..!");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest method");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite method");
	}
	
}
