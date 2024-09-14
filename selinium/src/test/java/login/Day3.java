package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day3 {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		try {
			// Navigate to the web page
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();

			// Perform login actions
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

			// Additional actions can be performed here after login
		} catch (Exception e) {
			e.getMessage(); 
			
		} finally {
			// Close the browser
			System.out.println("successfull");
			driver.quit();

		}
	}
}