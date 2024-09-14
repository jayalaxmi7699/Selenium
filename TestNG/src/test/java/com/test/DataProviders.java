package com.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	@Test(dataProvider = "dataSet")
	public void sedata(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}

	@DataProvider
	public Object[][] dataSet() {
		Object[][] obj = new Object[3][2];

		obj[0][0] = "user";
		obj[0][1] = "pass";
		obj[1][0] = "user1";
		obj[1][1] = "pass1";
		obj[2][0] = "user2";
		obj[2][1] = "pass2";

		return obj;

	}

}
