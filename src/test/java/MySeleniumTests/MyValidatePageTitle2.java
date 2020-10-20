package MySeleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class MyValidatePageTitle2 {
	
	@Test (description="Validate Page Title")
	public void validatePageTitle() {
		String chromeDriverLocation = "C:\\Users\\kiran\\eclipse-workspace\\contrail-qa-automation\\utils\\webAutomation\\src\\test\\resources\\binaries\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "http://freecrm.com/";
        String expectedTitle = "Free CRM #1 cloud software for any business large or Small";
        String actualTitle = "";
        
		driver.get(baseUrl);

		// get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        Assert.assertEquals("The title is matching", expectedTitle, actualTitle);
       
        //close Fire fox
        driver.close();
	}
}
