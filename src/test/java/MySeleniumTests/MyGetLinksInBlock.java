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

public class MyGetLinksInBlock extends BaseClass {

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
				
		// MAximize the window.
		driver.manage().window().maximize();
		
		// Define an Implicit Wait delay timeout of 10 secs for all pages (global setting).
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("This page title is: " + driver.getTitle());
		System.out.println("This page title length is: " + driver.getTitle().length());
		
		// Getting the count and the name of all elements.
		//WebElement elem1 = driver.findElement(By.xpath("//*[@id='www-wikipedia.org']/div[11]/div[3]"));
		WebElement elem1 = driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[9]/div[3]/div[2]"));
		
		List<WebElement> links = elem1.findElements(By.tagName("a"));
		
		System.out.println("Total links are : " + links.size());

		System.out.println("Printing the Links...");
		// Printing the Option tags.
		for (WebElement link : links) {
			System.out.println("Link text is: " + link.getText());
			System.out.println("Link href tag is: " + link.getAttribute("href"));
		}
		
	}
	
	@AfterClass
	public void teardown(){
		driver.quit();
	}
}