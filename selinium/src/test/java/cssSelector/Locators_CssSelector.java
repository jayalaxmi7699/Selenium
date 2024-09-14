package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_CssSelector {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");

		// tag Id -> tagname#id
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Hand bags");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("samsung");
	}

}
