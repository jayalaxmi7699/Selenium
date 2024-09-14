package _4dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {

	@Test(priority = 1, groups = {"sanity"})
	public void loginbyMail() {
		System.out.println("loginby E-Mail..");
	}

	@Test(priority = 2, groups = {"sanity"})
	public void loginbyFacebook() {
		System.out.println("loginby Facebook....");
	}

	@Test(priority = 3, groups = {"sanity"})
	public void loginByTwitter() {
		System.out.println("loginby Twitter..");
	}

	@Test(priority = 4, groups = {"sanity"})
	public void loginByWhatsAPP() {
		System.out.println("loginBy WhatsAPP..");
	}

	@Test(priority = 5)
	void logout() {
		Assert.assertTrue(true);
	}
}
