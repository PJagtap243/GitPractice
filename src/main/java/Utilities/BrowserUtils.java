package Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import FrameworkExceptions.MyException;
/**
 * This is the browser utilities class having all browser related utilities.
 */
public class BrowserUtils {
	
	private WebDriver driver;
	
	/**
	 * This is the method used to initialize the webdriver with specified browser name.
	 * Supports only for chrome, edge and firefox browsers.
	 * @param browserName
	 * @return 
	 */
	public WebDriver launchBrowser(String browserName) {
		
		if(browserName == null) {
			System.out.println("Please enter the browser name..");
			throw new MyException("Browser name can not be null..");
		}
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please enter the correct browser name..");
			throw new MyException("Browser name is not correct");
		}
		return driver;
	}
	
	/**
	 * This method will enter the specified url in browser.
	 * @param url
	 */
	public void enterUrl(String url) {
		if(url.contains("http")) {
		driver.get(url);
		}
		else {
			throw new MyException("url should have http(s)");
		}
	}
	
	/**
	 * This method is used to get the title of the current page, it will return string title.
	 * @return
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	/**
	 * This method is used to get the current page url, it will return string url.
	 * @return
	 */
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
	/**
	 * This method will quit the all the opened instances of the browser.
	 */
	public void quitBrowser() {
		driver.quit();
	}
	
	/**
	 * This method will close the current opened browser.
	 */
	public void closeBrowser() {
		driver.close();
	}

}
