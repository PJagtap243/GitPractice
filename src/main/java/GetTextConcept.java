import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By register_heading = By.xpath("//*[@id=\"content\"]/h1");
		By logo = By.xpath("//*[@id=\"logo\"]/a/img");
		
		Boolean flag1 = driver.findElement(register_heading).isDisplayed();
		System.out.println(flag1);
		
//		Boolean flag2 = driver.findElement(logo).isDisplayed();
//		System.out.println(flag2);
		
		Boolean flag2 = checkElementIsDisplayed(logo);
		System.out.println(flag2);
		
		By continue_btn = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		doClick(continue_btn);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static Boolean checkElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}

}
