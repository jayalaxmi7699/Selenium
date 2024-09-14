package _6ilisteners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(_6ilisteners.MyListener.class)
public class OrangeHRMapp {

	WebDriver driver;

	@BeforeClass
	public void setup() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	}

//	@Test
//	public void loginApp(String email, String pwd) throws InterruptedException {
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.findElement(By.name("username")).sendKeys(email);
//		driver.findElement(By.name("password")).sendKeys(pwd);
//		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
//	}

	@Test(priority = 1)
	void testLogo() throws InterruptedException {
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Thread.sleep(5000);
		Assert.assertTrue(true);
	}

	@Test(priority = 2)
	void testTitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeeHRM");
	}

	@Test(priority = 3, dependsOnMethods =  {"testTitle"})
	void testURL() {
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterClass
	void tearDown() {
		driver.quit();
	}

}
