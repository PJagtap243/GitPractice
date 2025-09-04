import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	static WebDriver driver;
	public static void main(String[] args) {
		BrowserUtils bUtil = new BrowserUtils();
		driver = bUtil.launchBrowser("chrome");
		bUtil.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By username = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eutil = new ElementUtil(driver);
		eutil.doSendKeys(username, "prashant@gmail.com");
		eutil.doSendKeys(password, "test@123");
		
	}

}
