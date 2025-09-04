import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		By country = By.xpath("//select[@name='country']");
		WebElement countryElement = driver.findElement(country);
		
		Select select = new Select(countryElement);
		
		//select.selectByIndex(5);
		
		//select.selectByValue("ANTARCTICA");
		
		//select.selectByVisibleText("ARMENIA");
		
		//doSelectDropdownValueByIndex(country,5);
		
		//doSelectDropdownValueByValue(country,"ANTARCTICA");
		
		doSelectDropdownValueByVisibleText(country,"INDIA");

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropdownValueByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectDropdownValueByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static void doSelectDropdownValueByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

}
