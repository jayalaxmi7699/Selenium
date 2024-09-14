package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginDataDrivenTest extends BaseClass {
	// DataProviders is from differeent pkg, here we r using so we have to mention
	// class also
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class, groups = "Datadriven")
	public void verify_loginDDT(String email, String pwd, String exp) {
		logger.info("****** TC003_LoginDataDrivenTest Started******");
		try {
			// HomePage
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			logger.info("clicked on Myaccount Link");
			hp.clickLogin();

			// LoginPage
			LoginPage lp = new LoginPage(driver);
			lp.setEmail(email);
			lp.setPassword(pwd);
			lp.clickLogin();

			// MyAccount
			MyAccountPage mac = new MyAccountPage(driver);
			boolean targetPage = mac.isMyAccountPageExists();

			/*
			 * Data is valid->login success-test pass-logout data is valid-> login failed
			 * -test fail
			 */
			if (exp.equalsIgnoreCase("valid")) {
				if (targetPage == true) {
					Assert.assertTrue(true);
					mac.clickLogout();
				} else {
					Assert.assertTrue(false);
				}
			}
			/*
			 * data is invalid->login success-test fail-logout data is invalid->login
			 * failed-test pass
			 */

			if (exp.equalsIgnoreCase("invalid")) {
				if (targetPage == true) {
					mac.clickLogout();
					Assert.assertTrue(false);
				} else {
					Assert.assertTrue(true);
				}
			}

		} catch (Exception e) {
			Assert.fail();
		}

		logger.info("****** TC003_LoginDataDrivenTest Finished******");
	}

}
