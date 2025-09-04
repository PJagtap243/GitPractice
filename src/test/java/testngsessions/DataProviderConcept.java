package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {

	WebDriver driver;
	@BeforeTest
	public void launcBrowserTest() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
	}
	
	@DataProvider
	public Object [][] testData() {
		return new Object [][] {
			{"abc@gmail.com","123"},
			{"pqr@gmail.com","456"},
			{"xyz@gmail.com","789"}
		};
	}
	
	@Test (dataProvider = "testData")
	public void loginTest(String uName, String pwd) {
		By username = By.id("input-email");
		By password = By.id("input-password");
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(uName);
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pwd);
	}
}
