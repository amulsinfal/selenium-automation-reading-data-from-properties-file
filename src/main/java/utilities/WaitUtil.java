package utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	public WaitUtil(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(ConfigReader.getValue("QA", "explicitWait"))));
	}
	
	public WebElement waitForElementToBeClickable(By locator) {
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public WebElement waitForElementToBeVisible(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
