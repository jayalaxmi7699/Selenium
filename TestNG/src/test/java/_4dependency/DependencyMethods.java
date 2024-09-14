package _4dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {

	@Test(priority = 1)
	public void openapp() {
		Assert.assertTrue(true);
	}

	@Test(priority = 2, dependsOnMethods = {"openapp"})
	public void login() {
		Assert.assertTrue(true);
	}

	@Test(priority = 3, dependsOnMethods = {"login"})
	public void search() {
		Assert.assertTrue(false);
	}

	@Test(priority = 4, dependsOnMethods = {"login", "search"})
	public void advSearch() {
		Assert.assertTrue(true);
	}

	@Test(priority = 5)
	void logout() {
		Assert.assertTrue(true);
	}
}
