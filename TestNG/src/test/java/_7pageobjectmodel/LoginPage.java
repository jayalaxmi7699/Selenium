package _7pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	// constructor
	LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// locators
	By txtUser_loc = By.xpath("//input[@placeholder='Username']");
	By txtpwd_loc = By.xpath("//input[@placeholder='Password']");
	By login_loc = By.xpath("//button[normalize-space()='Login']");

	// Action methods
	public void setUserName(String user) {
		driver.findElement(txtUser_loc).sendKeys(user);
	}

	public void setPwd(String pwd) {
		driver.findElement(txtpwd_loc).sendKeys(pwd);
	}

	public void setLogin() {
		driver.findElement(login_loc);
	}
}
