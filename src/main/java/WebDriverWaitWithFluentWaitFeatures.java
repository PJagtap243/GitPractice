import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitWithFluentWaitFeatures {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		By username = By.name("username2");
		By password = By.name("password");
		By login_btn = By.xpath("//button[@type='submit']");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait
			.pollingEvery(Duration.ofSeconds(2))
				.withMessage("Element not found in specified time")
					.ignoring(NoSuchElementException.class)
						.until(ExpectedConditions.presenceOfElementLocated(username)).sendKeys("Admin");
		
		driver.findElement(password).sendKeys("Admin");
		driver.findElement(login_btn).click();

	}

}
