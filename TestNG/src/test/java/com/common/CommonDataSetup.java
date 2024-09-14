package com.common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonDataSetup {
	@BeforeSuite
	void dataSetup() {
		System.out.println("common data setup");
	}
	@AfterSuite
	void datateardown() {
		System.out.println("common data cleanup");
	}

}
