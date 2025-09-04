import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassMoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		By mouseHoverBtn = By.id("mousehover");
		WebElement btnElement = driver.findElement(mouseHoverBtn);
		
		By menuOptions = By.xpath("//div[@class='mouse-hover']//a");
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(btnElement).perform();
		List<WebElement> optionsList = driver.findElements(menuOptions);
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
		}
	}

}
