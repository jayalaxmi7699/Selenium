package _5dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {

	WebDriver driver;

	@BeforeClass
	@Parameters({ "browser" })
	public void setup(String bro) throws InterruptedException {
		
		switch (bro.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
			
		case "edge":
			driver = new EdgeDriver();
			break;
			
		case "firefox":
			driver = new FirefoxDriver();
			break;
			
		default:
			System.out.println("Inavlaid broser");
			return;
	 // here return will not execute and exit from the code.
		}
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	}

//	@Test
//	public void loginApp(String email, String pwd) throws InterruptedException {
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.findElement(By.name("username")).sendKeys(email);
//		driver.findElement(By.name("password")).sendKeys(pwd);
//		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
//	}

	@Test(priority = 2)
	void testLogo() throws InterruptedException {
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Thread.sleep(5000);
		Assert.assertTrue( true);
	}

	@Test(priority = 1)
	void testTitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@Test(priority = 3)
	void testURL() {
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterClass
	void tearDown() {
		driver.quit();
	}

}