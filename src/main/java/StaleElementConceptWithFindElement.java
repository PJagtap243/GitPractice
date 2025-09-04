import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementConceptWithFindElement {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement userName = driver.findElement(By.name("email"));
		Thread.sleep(2000);
		userName.sendKeys("Admin");
		
		driver.navigate().refresh();
		
		userName = driver.findElement(By.name("email")); // Reinitialize the userName element to get the new WebElement ID.
		userName.sendKeys("NewAdmin");
	}

}
