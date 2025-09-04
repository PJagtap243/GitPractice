import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandelingConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(1500);
		
		WebElement twElement = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement fbElement = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement ytElement = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		WebElement liElement = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		
		String parentWindowId = driver.getWindowHandle();
		
		twElement.click();
		fbElement.click();
		ytElement.click();
		liElement.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> itr = windowHandles.iterator();
		
		while(itr.hasNext()) {
			String windowId = itr.next();
			driver.switchTo().window(windowId);
			String pageTitle = driver.getTitle();
			System.out.println(pageTitle);
			
			if(!windowId.equals(parentWindowId)) {
				driver.close();
			}
		}
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getCurrentUrl());
	}

}
