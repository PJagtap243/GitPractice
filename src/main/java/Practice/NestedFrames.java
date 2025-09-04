package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) throws InterruptedException {
	
		By firstCrush = By.id("inp_val");
		By currentCrush = By.id("jex");
		By destiny = By.id("glaf");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/iframe-scenario/");
		Thread.sleep(1500);
		
		driver.switchTo().frame("pact1");
		driver.findElement(firstCrush).sendKeys("FirstCrus");
		
		driver.switchTo().frame("pact2");
		driver.findElement(currentCrush).sendKeys("Current Crush");
		
		driver.switchTo().frame("pact3");
		driver.findElement(destiny).sendKeys("Destiny");
		
		driver.switchTo().parentFrame();
		driver.findElement(currentCrush).sendKeys("Current Crush updated");

		driver.switchTo().defaultContent();
		String pageHeader = driver.findElement(By.xpath("//h3[text()='Memory Test']")).getText();
		System.out.println(pageHeader);
	}

}
