package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemotest {
	@Test(dataProvider = "login")
	public void logintest(String username, String password) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		// Navigate to the web page
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		// Perform login actions
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		Assert.assertEquals("Swag Labs", driver.getTitle());
//		System.out.println("successfull");
		driver.quit();

	}

	@DataProvider(name = "login")
	public Object[][] loginData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "standard_user";
		data[0][1] = "12345";

		data[1][0] = "standard_user";
		data[1][1] = "secret_sauce";

		data[2][0] = "admin";
		data[2][1] = "secret_sauce";
		return data;

	}
}
