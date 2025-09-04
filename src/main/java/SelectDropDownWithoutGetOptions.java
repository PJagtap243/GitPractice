import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropDownWithoutGetOptions {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		By country = By.xpath("//select/option");
		
		List<WebElement> countryList = driver.findElements(country);
		for(WebElement e : countryList) {
			String countryOption = e.getText();
			if(countryOption.equals("INDIA")) {
				e.click();
			}
		}

	}

}
