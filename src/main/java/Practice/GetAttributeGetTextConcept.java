package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeGetTextConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		driver.findElement(By.id("input-firstname")).sendKeys("Prashant");
		
		String enetredValue = driver.findElement(By.id("input-firstname")).getDomProperty("value");
		System.out.println(enetredValue);
	}

}
