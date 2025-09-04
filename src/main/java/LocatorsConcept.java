import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	private static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//1
//		driver.findElement(By.id("input-email")).sendKeys("prashant@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		//2
//		WebElement userName = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		userName.sendKeys("prashant@gmail.com");
//		password.sendKeys("test@123");
		
		//3
//		By username = By.id("input-email");
//		By password = By.id("input-password");
//		WebElement userName = driver.findElement(username);
//		WebElement pwd = driver.findElement(password);
//		userName.sendKeys("prashant@gmail.com");
//		pwd.sendKeys("test@123");
		
		//4
//		By username = By.id("input-email");
//		By password = By.id("input-password");
//		getElement(username).sendKeys("prashant@gmail.com");
//		getElement(password).sendKeys("test@123");
		
		//5
//		By username = By.id("input-email");
//		By password = By.id("input-password");
//		doSendKeys(username, "prashant@gmail.com");
//		doSendKeys(password, "test@123");
		
		//6
		ElementUtil util = new ElementUtil(driver);
		By username = By.id("input-email");
		By password = By.id("input-password");
		util.doSendKeys(username, "prashant@gmail.com");
		util.doSendKeys(password, "test@123");
	}
	
	public static void doSendKeys(By locatorValue, String inputValue){
		getElement(locatorValue).sendKeys(inputValue);
	}
	
	public static WebElement getElement(By locatorValue) {
		return driver.findElement(locatorValue);
	}

}
