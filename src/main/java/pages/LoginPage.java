package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.WaitUtil;

public class LoginPage {
	
	protected WebDriver driver;
	protected WaitUtil waitUtil;
	private By txtUsername = By.id("user-name");
	private By txtPassword = By.id("password");
	private By btnLogin = By.id("login-button");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		waitUtil = new WaitUtil(driver);
	}
	
	public ProductsPage login(String userName, String password) {
		try {
			waitUtil.waitForElementToBeClickable(txtUsername).sendKeys(userName);
			waitUtil.waitForElementToBeClickable(txtPassword).sendKeys(password);
			waitUtil.waitForElementToBeClickable(btnLogin).click();
			return new ProductsPage(driver);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean isPageDisplayed() {
		try {
			return waitUtil.waitForElementToBeVisible(btnLogin).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

}
