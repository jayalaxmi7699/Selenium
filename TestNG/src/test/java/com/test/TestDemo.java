package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(groups = "regression")
public class TestDemo {
	
	@BeforeTest
	void beforetest() {
		System.out.println("Before Test");
	}
	@BeforeMethod
	void beforeEachMethod() {
		System.out.println("Example Db connect");
	}
	
	@AfterMethod
	void afterEachMethod() {
		System.out.println("Db disconnect");
	}

	@Test(priority = 2, description = "this is test", groups = "regression")
	void testmethod() {
		System.out.println("testmethod1 method");
	}

	@Test(priority = 1, groups = "retesting")
	void testmethod2() {
		System.out.println("testmethod2 method");
	}

	@AfterTest
	void afterTest() {
		System.out.println("After Test");
	}
}
