package MySeleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyLoginTest extends BaseClass {
	
	String browserName = "Firefox";
	public static void main(String[] args) throws InterruptedException {
				
		MyLoginTest obj = new MyLoginTest();
		obj.initBrowser();
		
	}
	
	public void initBrowser() throws InterruptedException {
		
		WebDriver driver = getWebdriverInstance(browserName);
		
		String baseUrl = "http://freecrm.com/";
        String expectedTitle = "Free CRM #1 cloud software for any business large or small";
        String actualTitle = "";
        
		driver.get(baseUrl);

		Thread.sleep(5000);
        //close Fire fox
        driver.close();
	}
	
}
