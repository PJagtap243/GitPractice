package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept1 {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		
		driver.switchTo().frame("content");
		String pageheading = driver.findElement(By.xpath("//h1[text()='Example home page ']")).getText();
		
		System.out.println(pageheading);
	}

}
