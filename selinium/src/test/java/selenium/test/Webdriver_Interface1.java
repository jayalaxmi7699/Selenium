package selenium.test;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver_Interface1 {

	public static String browser = "edge";
	static WebDriver driver;

	public static void main(String[] args) {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		try {
			// Navigate to the web page
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			// Perform login actions
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
			List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"inventory_container\"]/div"));
			System.out.println(list);
			
			driver.navigate().to("https://www.sugarcrm.com/");
			String windowhandle = driver.getWindowHandle();
			System.out.println(windowhandle);
			driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div/div[1]/div/a[1]"));

			Set<String> windowhandl = driver.getWindowHandles();
			System.out.println(windowhandl);
		} catch (Exception e) {
			System.out.println("exception occurs");
			e.printStackTrace();
		} finally {
			System.out.println("successfull");
			driver.quit();
		}

	}
}