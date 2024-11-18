package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By userName = By.xpath("//input[@id='input-email']");
	By passWord = By.xpath("//input[@id='input-password']");
	By login = By.xpath("//input[@value='Login']");

	public void enterUsername(String username) {
		driver.findElement(userName).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(passWord).sendKeys(password);
	}

	public void clickLogin() {
		driver.findElement(login).click();
	}

}
