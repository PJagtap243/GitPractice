import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		
		//Switch to frame using id
		//driver.switchTo().frame(2);
		
		//switch to frame using id or name
		//driver.switchTo().frame("main");
		
		//switch to frame using web element
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));
		
		String header = driver.findElement(By.xpath("//h2[text()='Title bar ']")).getText();
		System.out.println(header);
	}

}
