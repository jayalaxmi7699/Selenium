package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {

	WebDriver driver = new ChromeDriver();

//	@Test(priority = 1)
	public void launch() {

		WebDriverManager.chromedriver().setup();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

//	@Test(priority = 2)
	 void loginApp() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

//	@Test
//	public void navigateToInfo() {
//		System.out.println(driver.findElement(By.id("menu_pim_viewDetails")));
//	}
//	@Test(priority = 3)
	public void navigateToInfo() {
		System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img")));
	}
	

	
	public void verifyMyInfo() {
		System.out.println(driver.findElement(By.id("employee-details")).isDisplayed());
	}

//	@Test(priority = 5)
	public void verifyLogin() {
		WebElement element = driver.findElement(By.id("welcome"));
		System.out.println(element.isDisplayed());
		System.out.println(element.getText());
		driver.quit();
	}
}

