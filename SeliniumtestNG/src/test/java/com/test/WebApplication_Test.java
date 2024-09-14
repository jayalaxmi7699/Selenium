package com.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebApplication_Test {
	@Test
	public void search() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
		String actualTitle = driver.getTitle();
		String expectedTitle = "HYR Tutorials - Google Search";

		assertEquals(actualTitle, expectedTitle, "Title is mismatched");
		driver.quit();

	}

	@Test
	public void name() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("HYR Tutorials", Keys.ENTER);
		Thread.sleep(2000);
		
		SoftAssert asert = new SoftAssert();
		// Title assertion
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Log in to Facebook";
		asert.assertEquals(ActualTitle, ExpectedTitle, "Title is mismatched");

		// URL assertion
		String ActualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.facebook.com/";
		asert.assertNotEquals(ActualURL, expectedURL, "URL is mismatched");

		// text assertion
		String ActualText = driver.findElement(By.name("email")).getAttribute("value");
		String expectedText = "HYR Tutorials";
		asert.assertEquals(ActualText, expectedText, "Text is mismatched");

		// Border assertion
		String ActualBorder = driver.findElement(By.name("email")).getCssValue("border");
		String expectedBorder = "0.666667px solid rgb(221, 223, 226)";
		asert.assertEquals(ActualBorder, expectedBorder, "Border is mismatched");

//		// Error assertion
//		String ActualError = driver.findElement(By.name("email")).getCssValue("border");
//		String expectedError = "1px solid rgb(221, 223, 226)";
//		assertEquals(ActualError, expectedError, "error is mismatched");

		driver.close();
		asert.assertAll();
	}

}
