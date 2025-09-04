package Practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLinksConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		By links = By.tagName("a");
		
		//System.out.println("Total Count :" +getCount(links));
		System.out.println(getAllValues(links));
	}
	
	public static int getCount(By locator) {
		return driver.findElements(locator).size();
	}
	
	public static List<String> getAllValues(By locator) {
		List<WebElement> allValues = driver.findElements(locator);
		List<String> values = new ArrayList<String>();
		for(WebElement e : allValues) {
			String name = e.getText();
			if(!name.isEmpty()) {
			values.add(name);
		}
		}
		return values;
	}

}
