import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessConcept {

	public static void main(String[] args) {
	
		//For Chrome
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--headless=chrome");
		//op.addArguments("--headless");
		
		//For Firefox
		FirefoxOptions fp = new FirefoxOptions();
		fp.addArguments("--headless");
		
		//For Edge
		EdgeOptions ep = new EdgeOptions();
		ep.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(op);
		driver.get("https:\\www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
