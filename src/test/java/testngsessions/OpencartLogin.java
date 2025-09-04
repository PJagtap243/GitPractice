package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OpencartLogin extends BaseTest{
	
	@Test
	public void getTitleOfOpencart() {
		String actualTitle = driver.getTitle();
		Assert.assertTrue(actualTitle.contains("Account Login"));
	}
	
	@Test
	public void getUrlOfOpencart() {
		String actualUrl = driver.getCurrentUrl();
		Assert.assertTrue(actualUrl.contains("account/login"));
	}
}
