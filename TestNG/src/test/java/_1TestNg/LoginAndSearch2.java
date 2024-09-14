package _1TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginAndSearch2 {


	@BeforeClass
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

	@AfterClass
	void logout() {
		System.out.println("logout...");
	}
}
