package _3assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAsssertions {

	@Test
	void hardAssertionTestMethod() {

		System.out.println("Method1...");
		Assert.assertEquals("abc", "abc"); // t
		Assert.assertNotEquals(123, 123); // f

		System.out.println("Hard assertion....");
	}

	@Test
	void softAssertionTestMethod() {
		SoftAssert sa = new SoftAssert();
		System.out.println("Method2...");
		sa.assertEquals("abc", "abc"); // t
		sa.assertNotEquals(123, 123); // f

		System.out.println("soft assertion....");
		sa.assertAll();
	}
}
