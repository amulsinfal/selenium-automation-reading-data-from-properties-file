package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductsPage;
import utilities.ConfigReader;

public class LoginTest extends BaseTest {

	@Test
	public void testLoginWithValidCredentials() {
		LoginPage loginPage = new LoginPage(driver);
		ProductsPage productsPage = loginPage.login(ConfigReader.getValue("QA", "validUser"), ConfigReader.getValue("QA", "validPass"));
		assertTrue(productsPage.isPageDisplayed(), "Products Page is not displayed.");
	}
}
