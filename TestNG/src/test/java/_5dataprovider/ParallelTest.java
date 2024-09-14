package _5dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelTest {
	WebDriver driver;

	@BeforeClass
	public void launchApp() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	}

	@Test(dataProvider = "data")
	public void loginApp(String email, String pwd) throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		boolean status = driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
		if (status == true) {
			Assert.assertTrue(true);
			System.out.println(driver.getTitle());
		} else {
			Assert.fail();
		}
	}

	@AfterClass
	void tearDown() {
		driver.quit();
	}

	@DataProvider(name ="data" , indices = {3})
	Object[][] loginData() {
		Object data[][] = {
				{ "jfhk", "123" }, 
				{ "#%Y^", "CVFG$%" }, 
				{ "Admin", "123" }, 
				{ "Admin", "admin123" },
				{ "", "admin123" },
				};
		return data;

	}
}
