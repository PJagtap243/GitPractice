import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownSelection {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		driver.findElement(By.xpath("//div[text()='Select Option']")).click();
		
		Thread.sleep(1500);
		
		List<WebElement> dropDownEle = driver.findElements(By.xpath("//div[contains(@id,'react-select-2-option')]"));
		
		System.out.println(dropDownEle.size());
		
		for(WebElement e : dropDownEle) {
			String option = e.getText();
			if(option.equals("Group 1, option 2")) {
				e.click();
				break;
			}
		}
	}

}
