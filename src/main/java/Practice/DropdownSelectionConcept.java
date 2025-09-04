package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownSelectionConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
	
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.findElement(By.xpath("//div[@id='withOptGroup']")).click();
		
		List<WebElement> dropdownOptions = driver.findElements(By.xpath("//div[contains(@id,'react-select-2-option')]"));
		for(WebElement e : dropdownOptions) {
			if(e.getText().equals("Group 2, option 1")) {
				e.click();
				break;
			}
		}
	}

}
