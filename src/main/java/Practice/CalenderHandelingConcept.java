package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandelingConcept {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@title='Calendar-icon']")).click();
		Thread.sleep(2000);
		
		futureDate("June 2026",30);

	}
	
	public static void futureDate(String monthYear, int date) throws InterruptedException {
		String expMonthYear =  driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
		if(monthYear.contains("February") && date>28) {
			System.out.println("February month should not have date greater than 28");
		}
		else {
		while(!expMonthYear.equals(monthYear)) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			//Thread.sleep(1500);
			expMonthYear =  driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		}
		
		selectDate(date);
		}
	}
	
	public static void selectDate(int date) {
		if(date <=0 || date >31) {
			System.out.println("Please enter the valid date..");
		}else {
		driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
		}
	}

}
