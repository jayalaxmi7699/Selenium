package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {

	WebDriver driver = new ChromeDriver();
	

	@Test
	public void launchApp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();	
		driver.manage().window().maximize();		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
	}

	@Test
	public void loginApp() throws InterruptedException {
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]"));
	}

	@Test
	public void navigateToInfo() {
		System.out.println(driver.findElement(By.id("menu_pim_viewDetails")));
	}
//	@Test
//	public void navigateToInfo() {
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img")));
//	}
//	
//
//	@Test
//	public void verifyMyInfo() {
//		System.out.println(driver.findElement(By.id("employee-details")).isDisplayed());
//	}
//
//	@Test
//	public void verifyLogin() {
//		WebElement element = driver.findElement(By.id("welcome"));
//		System.out.println(element.isDisplayed());
//		System.out.println(element.getText());
//		driver.quit();
	}

