import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesUsingList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(1500);
		
		WebElement twElement = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement fbElement = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement ytElement = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		WebElement liElement = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		
		twElement.click();
		fbElement.click();
		ytElement.click();
		liElement.click();
		
		String parentWindowId = driver.getWindowHandle();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		ArrayList<String> windowList = new ArrayList<String>(windowHandles);
//		String parentWindowId = windowList.get(0);
//		String secondWindowId = windowList.get(1);
//		String thirdWindowId = windowList.get(2);
//		String fourthWindowId = windowList.get(3);
//		String fifthWindowId = windowList.get(4);
		
		for(int i =0; i<windowList.size(); i++) {
			driver.switchTo().window(windowList.get(i));
			String pageTitle = driver.getTitle();
			System.out.println(pageTitle);
			if(!pageTitle.equals(parentWindowId)) {
				driver.close();
			}
		}
	}

}
