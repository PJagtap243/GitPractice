import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownWithoutSelectMethods {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		By country = By.xpath("//select[@name='country']");
		WebElement countryElement = driver.findElement(country);
		
//		Select select = new Select(countryElement);
//		List<WebElement> dropDownOptions = select.getOptions();
//		System.out.println(dropDownOptions.size());
//		
//		for(WebElement e: dropDownOptions) {
//			String option = e.getText();
//			if(option.equals("INDIA")) {
//				e.click();
//			}
//		}
		
		System.out.println(getSelectDropDownOptionCount(country));
		doSelectDropDownOptionWithoutSelectMethod(country,"INDIA");

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static int getSelectDropDownOptionCount(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> dropDownOptions = select.getOptions();
		return dropDownOptions.size();
	}
	
	public static void doSelectDropDownOptionWithoutSelectMethod(By locator, String drodownOption) {
		Select select = new Select(getElement(locator));
		List<WebElement> dropDownOptions = select.getOptions();
		for(WebElement e : dropDownOptions) {
			String option = e.getText();
			if(option.equals(drodownOption)) {
				e.click();
		}
	}

}
	}
