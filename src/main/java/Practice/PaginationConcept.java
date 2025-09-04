package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationConcept {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dynamic-pagination-table");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		

		while(true) {
			List<WebElement>studentNames = driver.findElements(By.xpath("//td[text()='Prashant']"));
			if(studentNames.size()>0) {
				System.out.println(getStudentInfo("Prashant"));
				break;
			}else {
				WebElement next = driver.findElement(By.linkText("Next"));
				
				if(driver.findElement(By.xpath("//a[text()='Next']/parent::li")).getDomAttribute("class").contains("disabled")) {
					System.out.println("Student name is not available..");
					break;
				}
				
				next.click();
				Thread.sleep(1500);
			}
		}
	}
	
	public static String getStudentInfo(String studentName) {
		String studentMajor = driver.findElement(By.xpath("//td[text()='"+studentName+"']/following-sibling::td[4]")).getText();
		return studentMajor;
	}

}
