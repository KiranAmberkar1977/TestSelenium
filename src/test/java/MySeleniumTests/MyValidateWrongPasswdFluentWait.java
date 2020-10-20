package MySeleniumTests;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test; 

public class MyValidateWrongPasswdFluentWait extends BaseClass {

	private WebDriver driver;
	String browserName = "Firefox";
	
	@BeforeClass
	public void Startup(){
		driver = getWebdriverInstance(browserName);
	}
	
	@SuppressWarnings("unchecked")
	@Test (description="Google Login")
	public void ValidateWrongPasswdMsg() throws Exception{
		driver.get("http://gmail.com");
		
		System.out.println("This page title is: " + driver.getTitle());
		System.out.println("This page title length is: " + driver.getTitle().length());
		
		// MAximize the window.
		driver.manage().window().maximize();
		
		// Define an Implicit Wait delay timeout of 10 secs for all pages (global setting).
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Define FluentWait object also to handle any Object non-locatable issues.
		//WebDriverWait wait = new WebDriverWait(driver, 15);
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class)
				.withMessage("User defined timeout of 15 secs expired");
		
		// Find the Username web element and input the Username that we choose.
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("shubhapissay@gmail.com");
				
		//Click the next Button.
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
		//Thread.sleep(3000);
		
		//Enter some incorrect password in password field to elicit the Error message, click Next and extract this message.
		//driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("sdsdsds");
		//Using the explicitWait object here.
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"))).sendKeys("sdsdsds");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]")).click();
		
		//Grab the Error message and validate.
		WebElement elem = driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span"));
		System.out.println("The error message seen is: " + elem.getText());
	
		if (elem.getText().equals("Wrong password. Try again or click Forgot password to reset it."))
			System.out.println("Test has PASSED");
		else
			System.out.println("Test has FAILED");
		
	}
	
	@AfterClass
	public void teardown(){
		driver.quit();
	}
}
