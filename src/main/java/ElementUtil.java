
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	WebDriver driver;
	
	public ElementUtil (WebDriver driver){
		this.driver = driver;
	}

	public void doSendKeys(By locatorValue, String inputValue){
		getElement(locatorValue).sendKeys(inputValue);
	}
	
	public WebElement getElement(By locatorValue) {
		WebElement element = null;
		try {
		element = driver.findElement(locatorValue);
		}catch(NoSuchElementException e){
			e.printStackTrace();
			try {
				Thread.sleep(200);
				} catch (InterruptedException e1) {
				e1.printStackTrace();
			}element = driver.findElement(locatorValue);
		}return element;
	}
	
	public Boolean checkElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public String getElementAttributeValue(By locator, String attribute) {
		return driver.findElement(locator).getAttribute(attribute);
	}
	
	public String getElementText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public int getElementCount(By locator) {
		return getElements(locator).size();
	}
	
	public List<String> getElementText(By locator) {
		List<WebElement> listText = getElements(locator);
		List<String> str = new ArrayList<String>();
		for(WebElement e : listText) {
			String list = e.getText();
			if(!list.isEmpty()) {
			str.add(list);
		}
		}
		return str;
	}
	
	public List<WebElement> getElements(By locator) {
		List<WebElement> listOfLinks = driver.findElements(locator);
		return listOfLinks;
	}
}
