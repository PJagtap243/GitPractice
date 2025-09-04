import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("First Crush");
		
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("Second crush");
		
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("Third Crush");
		
		//Switch back to the parent frame or the default page.
		driver.switchTo().parentFrame();
		driver.findElement(By.id("jex")).sendKeys("Second crush Updated");
		
		//switch back to the default page
//		driver.switchTo().defaultContent();
//		String pageHeader = driver.findElement(By.xpath("//a[text()='SELECTORSHUB']")).getText();
//		System.out.println(pageHeader);
	}

}
