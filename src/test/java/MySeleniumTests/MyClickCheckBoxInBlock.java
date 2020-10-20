package MySeleniumTests;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test; 

public class MyClickCheckBoxInBlock extends BaseClass {

	private WebDriver driver;
	String browserName = "Chrome";
	
	@BeforeClass
	public void Startup(){
		driver = getWebdriverInstance(browserName);
	}
	
	@SuppressWarnings("unchecked")
	@Test (description="Google Login")
	public void ValidateWrongPasswdMsg() throws Exception{
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		
		System.out.println("This page title is: " + driver.getTitle());
		System.out.println("This page title length is: " + driver.getTitle().length());
		
		// MAximize the window.
		driver.manage().window().maximize();
		
		// Define an Implicit Wait delay timeout of 10 secs for all pages (global setting).
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Getting the count and the name of all elements.
		WebElement block = driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
		
		List<WebElement> links = block.findElements(By.name("sports"));
		
		System.out.println("Total links are : " + links.size());

		System.out.println("Clicking the searched Links...");
		for (WebElement link : links) {
			System.out.println("Checkbox tag name is: " + link.getTagName());
			System.out.println("Checkbox size is: " + link.getSize());
			link.click();
		}
		
		Thread.sleep(4000);
	}
	
	@AfterClass
	public void teardown(){
		driver.quit();
	}
}