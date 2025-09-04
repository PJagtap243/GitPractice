import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDragAndDropConcept {


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		By source = By.id("draggable");
		By target = By.id("droppable");
		
		WebElement sourceElement = driver.findElement(source);
		WebElement targetElement = driver.findElement(target);
		
		Actions act = new Actions(driver);
		//act.clickAndHold(sourceElement).moveToElement(targetElement).release().perform();
		act.dragAndDrop(sourceElement, targetElement).perform();
	}

}
