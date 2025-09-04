import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownWithMultiSelection {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@multiple]"));
		
		Select select = new Select(dropDown);
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Opel");
		select.selectByVisibleText("Audi");
		
		select.deselectAll();
	}

}
