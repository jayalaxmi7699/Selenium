package _2testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {

	
	@Test
	public void testmethod3() {

		System.out.println("testmethod3...");
	}

	@AfterSuite
	public void suite1()  {
		System.out.println("after suite......");
	}
	
	@BeforeSuite
	public void suit2()  {
		System.out.println("before suite......");
	}
	@BeforeClass
	void beforeclass() {
		System.out.println("Execute before class....");
	}
	@AfterClass
	void afterclass() {
		System.out.println("Execute after class.....");
	}

	@Test
	void testmethod() {
		System.out.println("testmethod1 method");
	}

	@Test
	void testmethod2() {
		System.out.println("testmethod2 method");
	}
	
	@BeforeTest
	void beforetest() {
		System.out.println("Execute before test");
	}
	@AfterTest
	void aftertest() {
		System.out.println("Execute after test");
	}
	@BeforeMethod
	void beforemethod() {
		System.out.println("Execute before method---->");
	}
	@AfterMethod
	void aftermethod() {
		System.out.println("Execute after method----->");
	}
}
