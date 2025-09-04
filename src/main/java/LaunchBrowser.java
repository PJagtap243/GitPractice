import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		String actTitle = driver.getTitle();
		if(actTitle.equals("Google")) {
			System.out.println("Correct Title");
		}else {
			System.out.println("In-Correct Title");
		}
		driver.quit();

	}

}
