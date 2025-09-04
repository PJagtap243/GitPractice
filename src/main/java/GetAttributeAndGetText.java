import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeAndGetText {


	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By login_link = By.xpath("//*[@id=\"column-right\"]/div/a[1]");
		
//		String login_attr = driver.findElement(login_link).getAttribute("href");
//		System.out.println(login_attr);
		
		String login_attr = getElementAttribute(login_link, "href");
		System.out.println(login_attr);
		
		By firstname = By.id("input-firstname");
		driver.findElement(firstname).sendKeys("Prashant");
		String entered_value = getElementAttribute(firstname, "value");
		System.out.println(entered_value);
		
		By register_heading = By.xpath("//*[@id=\"content\"]/h1");
//		String heading = driver.findElement(register_heading).getText();
//		System.out.println(heading);
		
		String heading = getElementText(register_heading);
		System.out.println(heading);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String getElementAttribute(By locator, String attribute) {
		return driver.findElement(locator).getAttribute(attribute);
	}
	
	public static String getElementText(By locator) {
		return driver.findElement(locator).getText();
	}
}
