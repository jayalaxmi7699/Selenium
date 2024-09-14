package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebApplication {
	@Test
	public void search() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("HYR tutorials", Keys.ENTER);
		Thread.sleep(2000);
		driver.close();		
		
	}
	@Test
	public void name() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		driver.manage().window().maximize();
		driver.findElement(By.name("FullName")).sendKeys("Tracing");
		Thread.sleep(2000);
		driver.close();
	}

}
