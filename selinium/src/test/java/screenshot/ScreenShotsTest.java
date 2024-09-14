package screenshot;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ScreenShotsTest extends ScreenShotsTestSetup {
@Test(testName  ="swagLabTitle" )
	public void swagLabTitle() {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//		String actTitle = driver.getTitle();
//		String expTitle = "Swag Labs";
//		assertEquals(actTitle, expTitle, "Title is mismatched");
	}

	@Test(testName  ="hyrTitle" )
	public void hyrTitle() {

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
		String actualTitle = driver.getTitle();
		String expectedTitle = "HYR Tutorials - Google Search";
		assertEquals(actualTitle, expectedTitle, "Title is mismatched");

	}
	@Test(testName  ="ebayTitle" )
	public void ebayTitle() {

		String exceptedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String exceptedText = "Search";
		driver.get("https://www.ebay.com/");
		String actualTitle = driver.getTitle();
		String actualtext = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		assertEquals(actualTitle, exceptedTitle, "Title Verification failed");
		assertEquals(actualtext, exceptedText, "Text Verification failed");
	}
	@Test(testName  ="facebook" )
	public void facebook() throws InterruptedException {

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("HYR Tutorials", Keys.ENTER);

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
		String expectedBorder = "1px solid rgb(221, 223, 226)";
		asert.assertEquals(ActualBorder, expectedBorder, "Border is mismatched");

//		// Error assertion
//		String ActualError = driver.findElement(By.name("email")).getCssValue("border");
//		String expectedError = "1px solid rgb(221, 223, 226)";
//		assertEquals(ActualError, expectedError, "error is mismatched");

		asert.assertAll();
	}

}
