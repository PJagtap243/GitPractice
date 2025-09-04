import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWaitsConcept {

	static ChromeDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		By username = By.name("username");

		// retryingElement(10, username).sendKeys("Admin");
		retryingElement(10, 2000, username).sendKeys("Admin");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static WebElement retryingElement(int timeOut, By locator) {
		int attempt = 0;
		WebElement element = null;

		while (attempt < timeOut) {
			try {
				element = getElement(locator);
				System.out.println("Element found in " + attempt + "attempts..");
				break;
			} catch (NoSuchElementException e) {
				System.out.println("Element is not found..");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			attempt++;
		}
		if (element == null) {
			System.out.println("Element is not found..");
		}
		return element;
	}

	public static WebElement retryingElement(int timeOut, long pollingTime, By locator) {

		int attempt = 0;
		WebElement element = null;
		while (attempt < timeOut) {
			try {
				element = getElement(locator);
				System.out.println("Element found in " + attempt + " attempts..");
				break;
			} 
			catch (NoSuchElementException e) {
				System.out.println("Element is not found..");
				try {
					Thread.sleep(pollingTime);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			attempt++;
		}
		if (element == null) {
			System.out.println("Element is not found..");
		}
		return element;
	}
	
	
}
