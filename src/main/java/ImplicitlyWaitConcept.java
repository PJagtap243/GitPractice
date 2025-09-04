import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Selenium 3.X
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Selenium 4.X
		
		By username = By.name("username");
		By password = By.name("password");
		By login_btn = By.xpath("//button[@type='submit']");
		
		driver.findElement(username).sendKeys("Admin");
		driver.findElement(password).sendKeys("Admin");
		driver.findElement(login_btn).click();

	}

}
