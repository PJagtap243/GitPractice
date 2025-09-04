import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementConceptWithFindElements {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		List<WebElement> footerLinks = driver.findElements(By.xpath("//footer//a"));
		
		for(int i=0; i<footerLinks.size(); i++) {
			footerLinks.get(i).click();
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
			driver.navigate().back();
			footerLinks = driver.findElements(By.xpath("//footer//a"));			
		}
	}

}
