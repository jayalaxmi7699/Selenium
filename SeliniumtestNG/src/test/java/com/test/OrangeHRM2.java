package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM2 {	

//	@Test
//	public void launchApp() {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		System.out.println("successfull launchApp");
//	}

	@Test
	public void loginApp() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		driver.close();
		
		System.out.println("successfull loginApp");
		
	}

//	@Test
//	public void navigateToInfo() {
//		System.out.println(driver.findElement(By.id("menu_pim_viewDetails")));
//	}
	
//	@Test(priority = 3)
//	public void navigateToInfo() {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img")));
//		System.out.println("successfull navigateToInfo");
//	
//	}
	

//	@Test(priority = 4)
//	public void verifyMyInfo() {
//		WebDriver driver = new ChromeDriver();
//		System.out.println(driver.findElement(By.id("employee-details")).isDisplayed());
//	}
//
//	@Test(priority = 5)
//	public void verifyLogin() {
//		WebDriver driver = new ChromeDriver();
//		WebElement element = driver.findElement(By.id("welcome"));
//		System.out.println(element.isDisplayed());
//		System.out.println(element.getText());
//		driver.quit();
//	}
}
