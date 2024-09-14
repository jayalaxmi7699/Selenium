package com.test;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Before_AterGroups {
	@BeforeGroups(value = "regression")
	void beforeGroup() {
		System.out.println("Execute before gruop");
	}
	@AfterGroups(value = "regression")
	void afterGroup() {
		System.out.println("Execute after gruop");
	}

	@Test(priority = 2, description = "this is test", groups = "regression")
	void testmethod() {
		System.out.println("testmethod1 method");
	}

	@Test(priority = 1, groups = "retesting")
	void testmethod2() {
		System.out.println("testmethod2 method");
	}
}
