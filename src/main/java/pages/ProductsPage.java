package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.WaitUtil;

public class ProductsPage {
	
	protected WebDriver driver;
	protected WaitUtil waitUtil;
	private By pageHeader = By.xpath("//span[@class='title']");
	private By btnMenu = By.id("react-burger-menu-btn");
	private By lnkLogout = By.id("logout_sidebar_link");

	public ProductsPage(WebDriver driver) {
		this.driver = driver;
		waitUtil = new WaitUtil(driver);
	}

	public boolean isPageDisplayed() {
		try {
			return waitUtil.waitForElementToBeVisible(pageHeader).getText().equals("Products");
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public LoginPage logout() {
		try {
			waitUtil.waitForElementToBeClickable(btnMenu).click();
			waitUtil.waitForElementToBeClickable(lnkLogout).click();
			return new LoginPage(driver);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

