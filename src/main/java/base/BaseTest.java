package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import factory.DriverFactory;
import utilities.ConfigReader;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		String browser = ConfigReader.getValue("QA", "browser");
		String url = ConfigReader.getValue("QA", "url");
		driver = DriverFactory.initializeDriver(browser);
		driver.get(url);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
