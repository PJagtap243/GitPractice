package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[contains(@title,'Search for Products')]")).sendKeys("iphone");

		WebElement searchbtn = driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(searchbtn).click().build().perform();
	}

}
