package _4dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentTest {

	@Test(priority = 1,groups = {"sanity", "regression", "functional"})
	public void paymentinRupees() {
		System.out.println("payment in Rupees..");
	}

	@Test(priority = 2,groups = {"sanity", "regression","functional"})
	public void paymentinDollar() {
		System.out.println("payment in Dollar....");
	}

	@Test(priority = 3)
	public void paymentinEuros() {
		System.out.println("payment in Euros..");
	}

	@Test(priority = 4,groups = {"sanity", "regression","functional"})
	public void paymentinKDs() {
		System.out.println("payment in KDs..");
	}

	@Test(priority = 5)
	void logout() {
		Assert.assertTrue(true);
	}
}
