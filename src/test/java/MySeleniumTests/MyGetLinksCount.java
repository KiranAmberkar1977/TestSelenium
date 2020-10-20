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

public class MyGetLinksCount extends BaseClass {

	private WebDriver driver;
	String browserName = "Chrome";
	
	@BeforeClass
	public void Startup(){
		driver = getWebdriverInstance(browserName);
	}
	
	@SuppressWarnings("unchecked")
	@Test (description="Google Login")
	public void ValidateWrongPasswdMsg() throws Exception{
		driver.get("https://www.wikipedia.org/");
		
		System.out.println("This page title is: " + driver.getTitle());
		System.out.println("This page title length is: " + driver.getTitle().length());
		
		// MAximize the window.
		driver.manage().window().maximize();
		
		// Define an Implicit Wait delay timeout of 10 secs for all pages (global setting).
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Getting the count and the name of all elements.
		List<WebElement> myLinkElements = driver.findElements(By.tagName("a"));
		
		// Printing the count of Option tags.
		System.out.println("Total count of tags is: " + myLinkElements.size());
		
		// Printing the Option tags.
		for (WebElement elem : myLinkElements) {
			System.out.println("Link text is: " + elem.getText());
			System.out.println("Link href tag is: " + elem.getAttribute("href"));
		}
		
	}
	
	@AfterClass
	public void teardown(){
		driver.quit();
	}
}