package _4dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest {

	@Test(priority = 1, groups = {"regression"})
	public void signupByMail() {
		System.out.println("signup By Mail..");
	}

	@Test(priority = 2, groups = {"regression"})
	public void signupbyFacebook() {
		System.out.println("signup by Facebook....");
	}

	@Test(priority = 3, groups = {"regression"})
	public void signupByTwitter() {
		System.out.println("signup By Twitter..");
	}

	@Test(priority = 4)
	public void signupByWhatsAPP() {
		System.out.println("signup By WhatsAPP..");
	}

	@Test(priority = 5, groups = {"regression"})
	void logout() {
		Assert.assertTrue(true);
	}
}
