
public class LaunchAmazon {

	public static void main(String[] args) {
		
		BrowserUtils brutl = new BrowserUtils();
		brutl.launchBrowser("chrome");
		
		brutl.enterUrl("https://www.amazon.com");
		
		String pageTitle = brutl.getPageTitle();
		System.out.println(pageTitle);
		
		brutl.quitBrowser();

	}

}
