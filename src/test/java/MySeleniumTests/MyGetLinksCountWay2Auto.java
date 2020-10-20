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

public class MyGetLinksCountWay2Auto extends BaseClass {

	private WebDriver driver;
	String browserName = "Chrome";
	
	@BeforeClass
	public void Startup(){
		driver = getWebdriverInstance(browserName);
	}
	
	@SuppressWarnings("unchecked")
	@Test (description="Google Login")
	public void ValidateWrongPasswdMsg() throws Exception{
		driver.get("http://google.co.in");
		
		// MAximize the window.
		driver.manage().window().maximize();
		
		// Define an Implicit Wait delay timeout of 10 secs for all pages (global setting).
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Define ExplicitWait object also to handle any Object non-locatable issues.
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		//WebElement elem = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		//elem.sendKeys("Way2Automation");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"))).sendKeys("Way2Automation");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rso']/div[1]/div/div/div[1]/a/h3/span"))).click();
				
		System.out.println("This page title is: " + driver.getTitle());
		System.out.println("This page title length is: " + driver.getTitle().length());
		
		// Getting the count and the name of all elements.
		List<WebElement> myLinkElements = driver.findElements(By.tagName("a"));
				
		// Printing the count of Option tags.
		System.out.println("Total count of tags is: " + myLinkElements.size());
				
		System.out.println("Printing the Links...");
		// Printing the Option tags.
		for (WebElement link : myLinkElements) {
			System.out.println("Link text is: " + link.getText());
			System.out.println("Link href tag is: " + link.getAttribute("href"));
		}
		
	}
	
	@AfterClass
	public void teardown(){
		driver.quit();
	}
}