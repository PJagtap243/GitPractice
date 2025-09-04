package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept2 {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		Thread.sleep(1500);
		
		driver.switchTo().frame("pact1");
		WebElement firstCrush = driver.findElement(By.xpath("//input[@id='inp_val']"));
		firstCrush.sendKeys("First Crush Entered");
		
		driver.switchTo().frame("pact2");
		WebElement secondCrush = driver.findElement(By.id("jex"));
		secondCrush.sendKeys("second crush entered");
	
		driver.switchTo().frame("pact3");
		WebElement thirdCrush = driver.findElement(By.id("glaf"));
		thirdCrush.sendKeys("Third Crush Entered");
		
	}
	

}
