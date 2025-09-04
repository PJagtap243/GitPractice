import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrouselHandelingConcept {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.noon.com/uae-en/");
		
		String xpath = "//h2[text()='Recommended for you']/../../following-sibling::div//div//h2[@data-qa='product-name']";
		
		List<WebElement> prodList = driver.findElements(By.xpath(xpath));
		
		String nextBtn = "//h2[text()='Recommended for you']/../../following-sibling::div//div//button[contains(@class,'embla__button--next')]";
		WebElement btnElement = driver.findElement(By.xpath(nextBtn));
		
		Set<String> prodSet = new LinkedHashSet<String>();
		Thread.sleep(1500);
		while(!driver.findElement(By.xpath(nextBtn)).getDomAttribute("class").contains("disabled")) {
			for(WebElement e : prodList) {
				String title = e.getDomAttribute("title");
				prodSet.add(title);
			}
			if(btnElement.isEnabled()) {
			driver.findElement(By.xpath(nextBtn)).click();
			}else {
				break;
			}
		}
		for(String e : prodSet) {
			System.out.println(e);
		}
	}

}
