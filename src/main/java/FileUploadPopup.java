import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		
		//Tag should have Type as File
		driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\prash\\OneDrive\\Documents\\Prashant Jagtap-QA.pdf");
	}

}
