import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLinkConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		By links = By.tagName("a");
		By imgs = By.tagName("img");
		
//		List<WebElement> listOfLinks = driver.findElements(linkTag);
//		
//		System.out.println(listOfLinks.size());
//		
//		int count = 0;
//		for(WebElement e : listOfLinks) {
//			String list = e.getText();
//			if(!list.isBlank()) {
//			System.out.println(count +" : " +list);
//			count++;
//			}
//		}
		int elementCount = getElementCount(links);
		System.out.println(elementCount);
		
		List<String> actualList = getElementText(links);
		System.out.println(actualList);
	}
	
	public static int getElementCount(By locator) {
		return getElements(locator).size();
	}
	
	public static List<String> getElementText(By locator) {
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
	
	public static List<WebElement> getElements(By locator) {
		List<WebElement> listOfLinks = driver.findElements(locator);
		return listOfLinks;
	}

}
