package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test(groups = "retesting")
public class VerifyTitlebyAssertion {
	@Test
	public void test1Method() {
		SoftAssert sassert = new SoftAssert();

		String exceptedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String exceptedText = "Search";

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.ebay.com/");
		String actualTitle = driver.getTitle();
		System.out.println("verify title");
		String actualtext = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		System.out.println("verify text");
		sassert.assertEquals(actualTitle, exceptedTitle, "Title Verification failed");
		sassert.assertEquals(actualtext, exceptedText, "Text Verification failed");
		driver.close();
		sassert.assertAll();

	}
}
