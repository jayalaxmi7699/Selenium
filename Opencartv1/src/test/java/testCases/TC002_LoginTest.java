package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {

	@Test(groups = { "Sanity", "Master" })
	public void verify_login() {
		logger.info("****** TC002_LoginTest Started******");
		try {
			// HomePage
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			logger.info("clicked on Myaccount Link");
			hp.clickLogin();

			// LoginPage
			LoginPage lp = new LoginPage(driver);
			lp.setEmail(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			lp.clickLogin();

			// MyAccount
			MyAccountPage mac = new MyAccountPage(driver);
			boolean targetPage = mac.isMyAccountPageExists();
			if (targetPage) {
				logger.info("Login successful.");
				Assert.assertTrue(true);
			} else {
				logger.error("Login failed.");
				Assert.fail("Login failed. My Account page not found.");
			}
		} catch (Exception e) {
			logger.error("Test failed due to exception: " + e.getMessage());
			Assert.fail();
			logger.info("****** TC002_LoginTest Finished******");
		}
	}

}
