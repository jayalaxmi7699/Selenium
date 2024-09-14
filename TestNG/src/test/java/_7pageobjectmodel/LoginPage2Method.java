package _7pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2Method {

	WebDriver driver;

	// constructor
	LoginPage2Method(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// locators
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement txt_username;	
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement txt_pwd;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement txt_loginF;
		
	// Action methods
	public void setUserName(String user) {
		txt_username.sendKeys(user);
	}

	public void setPwd(String pwd) {
		txt_pwd.sendKeys(pwd);
	}

	public void setLogin() {
		txt_loginF.click();
	}
}
