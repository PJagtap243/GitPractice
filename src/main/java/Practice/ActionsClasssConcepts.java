package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClasssConcepts {

	static WebDriver driver;
	static Actions act;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		//dragAndDropTest();
		rightClickMethodTest();
	}
	
	public static void dragAndDropTest() {
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		By dragable = By.id("draggable");
		By dropable = By.id("droppable");
		
		WebElement sourceElement = driver.findElement(dragable);
		WebElement targetElement = driver.findElement(dropable);
		
		act = new Actions(driver);
		//act.dragAndDrop(sourceElement, targetElement).perform();
		act.clickAndHold(sourceElement).moveToElement(targetElement).release().perform();
	}
	
	public static void rightClickMethodTest() throws InterruptedException {
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		act = new Actions(driver);
		WebElement rightClickBtn = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		act.contextClick(rightClickBtn).perform();
		
		List<WebElement> optionsList = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li"));
		Thread.sleep(1500);
		for(WebElement e : optionsList) {
			//System.out.println(e.getText());
			if(e.getText().equals("Copy")) {
				e.click();
				break;
			}
		}
	}

}
