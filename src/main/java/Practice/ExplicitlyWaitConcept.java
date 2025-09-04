package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		By searchBar = By.xpath("//input[contains(@title,'Search for Products')]");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(searchBar)).sendKeys("iphone");

		WebElement searchbtn = driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(searchbtn).click().build().perform();
	}

}
