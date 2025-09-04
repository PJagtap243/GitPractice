package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandlingConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dynamic-table");
		getCPUValueForBrowser("System");
	}
	
	public static void getCPUValueForBrowser(String browserName) {
		List<WebElement> browserList = driver.findElements(By.xpath("//table[@class='table table-striped']//td[1]"));
		WebElement cpuValue = driver.findElement(By.xpath("//table[@class='table table-striped']//td[text()='"+browserName+"']/following-sibling::td[1]"));
		WebElement memoryValue = driver.findElement(By.xpath("//table[@class='table table-striped']//td[text()='"+browserName+"']/following-sibling::td[2]"));
		WebElement diskValue = driver.findElement(By.xpath("//table[@class='table table-striped']//td[text()='"+browserName+"']/following-sibling::td[3]"));
		WebElement networkValue = driver.findElement(By.xpath("//table[@class='table table-striped']//td[text()='"+browserName+"']/following-sibling::td[4]"));
		
		for(WebElement e : browserList) {
			String browsrs = e.getText();
			if(browsrs.equalsIgnoreCase(browserName)) {
				System.out.println("Browser Details are: Browser Name = "+browserName+" CPU = "+cpuValue.getText()+
						" Memory = "+memoryValue.getText()+"Disk = "+diskValue.getText()+" Network = "+networkValue.getText()+"");
				break;
			}
		}
	}

}
