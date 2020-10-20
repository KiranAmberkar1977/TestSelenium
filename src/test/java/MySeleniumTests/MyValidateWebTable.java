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

public class MyValidateWebTable extends BaseClass {

	private WebDriver driver;
	String browserName = "Chrome";
	
	@BeforeClass
	public void Startup(){
		driver = getWebdriverInstance(browserName);
	}
	
	@SuppressWarnings("unchecked")
	@Test (description="Google Login")
	public void ValidateWrongPasswdMsg() throws Exception{
		driver.get("https://money.rediff.com/gainers/");
		
		System.out.println("This page title is: " + driver.getTitle());
		System.out.println("This page title length is: " + driver.getTitle().length());
		
		// MAximize the window.
		driver.manage().window().maximize();
		
		// Define an Implicit Wait delay timeout of 10 secs for all pages (global setting).
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Getting the count of number of rows.
		List<WebElement> rowNum = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("Total no. of rows are : " + rowNum.size());

		// Getting the count of number of columns.
		List<WebElement> colNum = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		System.out.println("Total no. of columns are : " + colNum.size());

		System.out.println("Printing the column details of each row...");
		for (int row = 1; row <= rowNum.size(); row++ ) {
			String colXpath = "//table[@class='dataTable']/tbody/tr[" + row + "]/td";
			
			colNum = driver.findElements(By.xpath(colXpath));
			
			for (WebElement link : colNum) {	
				System.out.println("Row index is: " + row);
				System.out.println("Column text is: " + link.getText());
			}
		}
		Thread.sleep(4000);
	}
	
	@AfterClass
	public void teardown(){
		driver.quit();
	}
}