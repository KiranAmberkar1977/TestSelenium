package MySeleniumTests;

import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test; 

public class MyValidateWikidTitle {

	private WebDriver driver;
	
	@BeforeClass
	public void Startup(){
		//driver = new FirefoxDriver();
		String chromeDriverLocation = "C:\\Users\\kiran\\eclipse-workspace\\contrail-qa-automation\\utils\\webAutomation\\src\\test\\resources\\binaries\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
		driver = new ChromeDriver();
	}
	
	@Test (description="Google Login")
	public void validateWikipediaTitle() throws Exception{
		driver.get("http://www.wikipedia.org/");
		assertEquals("Wikipedia", driver.getTitle());
		
		Thread.sleep(4000);
		
		assertEquals("The Free Encyclopedia", driver.findElement(By.cssSelector("strong")).getText());
		driver.findElement(By.cssSelector("strong")).click();
		Assert.assertEquals("Wikipedia", driver.getTitle());
	}
	
	@AfterClass
	public void teardown(){
		driver.quit();
	}
}
