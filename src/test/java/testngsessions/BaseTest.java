package testngsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

	WebDriver driver;
	ChromeOptions co;
	
	@Parameters({"browser","url", "headless"})
	@BeforeTest
	public void launchBrowser(String browserName, String url, String headless) {
		switch (browserName) {
		case "chrome":
			co = new ChromeOptions();
			if(Boolean.parseBoolean(headless) == true) {				
				co.addArguments("--headless=new");
			}
			driver = new ChromeDriver(co);
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Please pass the correct browser name..");
			break;
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
