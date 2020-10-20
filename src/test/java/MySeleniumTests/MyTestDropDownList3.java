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

public class MyTestDropDownList3 extends BaseClass {

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

		// This fails in selecting ET and selects Espanol(ES) instead.
		WebElement elem = driver.findElement(By.id("searchLanguage"));
		
		Select select = new Select(elem);
		
		// Selecting Hindi language from drop-down.
		select.selectByValue("hi");
		Thread.sleep(3000);
		
		// Selecting First language from drop-down.
		select.selectByIndex(0);
		Thread.sleep(3000);

		// Getting the count and the name of all elements.
		List<WebElement> myDropdown = driver.findElements(By.tagName("option"));
		
		// Printing the count of Option tags.
		System.out.println("Total count of tags is: " + myDropdown.size());
		
		// Printing the Option tags.
		for (WebElement elem2 : myDropdown) {
			System.out.println("Element text is: " + elem2.getText());
			System.out.println("Attribute value is: " + elem2.getAttribute("lang"));
		}
	}
	
	@AfterClass
	public void teardown(){
		driver.quit();
	}
}