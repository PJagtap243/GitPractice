package testngsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Google extends BaseTest{
	
	@Test
	public void getGoogleTitleTest() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "Google");
	}
	
	@Test
	public void getGoogleUrlTest() {
		String actualUrl = driver.getCurrentUrl();
		Assert.assertTrue(actualUrl.contains("google"));
	}

}
