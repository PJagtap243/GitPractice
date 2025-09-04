package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGElementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[contains(@title,'Search for Products')]")).sendKeys("iphone");
		
		Thread.sleep(5000);
		WebElement searchbtn = driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(searchbtn).click().build().perform();
		
		
	}

}
