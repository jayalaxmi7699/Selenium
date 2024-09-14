package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.common.CommonDataSetup;

//@Test(groups = "regression")
public class TestDemo2 extends CommonDataSetup {
	
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
	void test2() {
		System.out.println("test2 method");
	}

	@Test(priority = 1, groups = "retesting")
	void test1() {
		System.out.println("test1 method");
	}

	@AfterTest
	void afterTest() {
		System.out.println("After Test");
	}
}
