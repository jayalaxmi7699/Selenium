package com.test;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Skip_TestCases {
	
	Boolean datasetup = true;
	
	@Test(enabled = false)
	public void skip1() {
		System.out.println("Skip test method, it is incomplete");
	}

	@Test
	public void skip2() {
		System.out.println("Skip test method by skipexception");
		throw new SkipException("Error in method");
	}

	@Test
	public void skip3() {
		System.out.println("Skip test method, it is incomplete");
		if(datasetup = true) {
			System.out.println("Executed successfully");
		}
		else {
			throw new SkipException("Cannot proceed further");
		}
	}

	@Test
	public void skip4() {
		System.out.println("Excute test method..");
	}

}
