package MySeleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver getWebdriverInstance(String browserName) {
		WebDriver driver = null; 
		
		if (browserName.equals("Chrome")) {
//			String chromeDriverLocation = "C:\\KiranStuffs\\ProjectDocs\\Automation\\SeleniumEXEs\\chromedriver_win32\\chromedriver.exe";
//			System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
//			chrome_options = webdriver.ChromeOptions();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			return driver;
		}
		else if (browserName.equals("Firefox")) {
//			String firefoxDriverLocation = "C:\\chromedriver.exe";
//			System.setProperty("webdriver.firefox.driver", firefoxDriverLocation);
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			return driver;
		}
		else if (browserName.equals("InternetExplorer")) {
//			String internetExplorerDriverLocation = "C:\\chromedriver.exe";
//			System.setProperty("webdriver.internetexplorer.driver", internetExplorerDriverLocation);
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			return driver;
		}
		else
			return driver;
	}
}
