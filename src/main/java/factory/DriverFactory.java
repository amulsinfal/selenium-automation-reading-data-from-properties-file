package factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilities.ConfigReader;

public class DriverFactory {

	private static WebDriver driver;
	
	public static WebDriver initializeDriver(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--incognito");
			driver = new ChromeDriver(chromeOptions);
		} else if(browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if(browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(ConfigReader.getValue("QA", "implicitWait"))));
		driver.manage().window().maximize();
		return driver;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
