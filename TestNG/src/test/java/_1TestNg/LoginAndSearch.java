package _1TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginAndSearch {

//	WebDriver driver;

	@BeforeMethod
	public void login() {
		System.out.println("login...");
	}

	@Test(priority = 1)
	public void search() {

		System.out.println("search...");
	}

	@Test(priority = 2)
	public void advSearch() throws InterruptedException {
		System.out.println("advsearch......");
	}

	@AfterMethod
	void logout() {
		System.out.println("logout...");	
	}
}
