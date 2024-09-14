package com.common;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ListenersDemo.class})
public class CarLoan {
	@Test
	public void WebLoginCarLoan() {
		System.out.println("Method1 Web Login Home Loan");
	}

	@Test
	public void MobileLoginCarLoan() {
		System.out.println("Mobile Login Home Loan");
		Assert.assertTrue(false);
	}

	@Test(timeOut =1000)
	public void APPLoginCarLoan() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("API Login Home Loan");
		
	}
	@Test(dependsOnMethods ="APPLoginCarLoan" )
	public void APILoginCarLoan() {
		System.out.println("API Login Home Loan");
	}
}