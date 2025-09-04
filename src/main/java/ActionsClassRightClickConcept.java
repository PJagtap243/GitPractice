import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassRightClickConcept {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		By rightClickBtn = By.xpath("//span[@class='context-menu-one btn btn-neutral']");
		WebElement btn = driver.findElement(rightClickBtn);
		
		By menuOptions = By.xpath("//ul[@class = 'context-menu-list context-menu-root']//span");
		List<WebElement> options = driver.findElements(menuOptions);
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.contextClick(btn).perform();
		Thread.sleep(2000);
		
		for(WebElement e : options) {
			String text = e.getText();
			if(text.equals("Copy")) {
				e.click();
				break;
			}
		}
	//	By option = By.xpath("//span[text()='Copy']");
		//driver.findElement(option).click();
	}

}
