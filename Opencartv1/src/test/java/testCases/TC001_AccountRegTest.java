package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegTest extends BaseClass {

	@Test(groups = {"Regression", "Master"})
	public void verify_account_registration() {
		logger.info("****** TC001_AccountRegTest Started******");
		try {
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			logger.info("clicked on Myaccount Link");
			hp.clickRegister();
			logger.info("clicked on Register Link");
			AccountRegistrationPage regpage = new AccountRegistrationPage(driver);

			logger.info("Providing customer deatils");
			regpage.setFirstName(randomString().toUpperCase());
			regpage.setLastName(randomString().toUpperCase());
			regpage.setEmail(randomString() + "@gmail.com");
			regpage.setTelephone(randomNumber());

			String password = randomAlphaNumeric();
			regpage.setPassword(password);
			regpage.setConfirmPwd(password);

			regpage.setPrivacyPolicy();
			regpage.clickContinue();
			logger.info("validating expected message");
			String confmsg = regpage.getConfirmationmsg();
			if(confmsg.equals("Your Account Has Been Created!")) {
				Assert.assertTrue(true);
			}else {
				logger.error("Test failed....");
				logger.debug("Debug logs..");
				Assert.assertTrue(false);
			}
//			Assert.assertEquals(confmsg, "Yourr Account Has Been Created!");
		} catch (Exception e) {
			
			Assert.fail();
		}
		logger.info("****** TC001_AccountRegTest Finished******");
		
	}

}
