package MySeleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyValidatePageTitle extends BaseClass {
	
	String browserName = "InternetExplorer";
	public static void main(String[] args) {
		
		MyValidatePageTitle obj = new MyValidatePageTitle();
		obj.initBrowser();
		
	}
	
	public void initBrowser() {
		WebDriver driver = getWebdriverInstance(browserName);
		
		String baseUrl = "http://freecrm.com/";
        String expectedTitle = "Free CRM #1 cloud software for any business large or small";
        String actualTitle = "";
        
		driver.get(baseUrl);

		// get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        driver.close();
	}
}
