import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigations {

	public static void main(String[] args) throws MalformedURLException {
		
		String url = "https:\\www.amazon.com";
		
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.google.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().to(new URL(url));
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());

		driver.quit();
	}

}
