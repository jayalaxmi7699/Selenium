package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators_CssSelector2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		// tag Id -> tag#id
//		driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("Hand bags");
//		       // OR
//		driver.findElement(By.cssSelector("#APjFqb")).sendKeys("Hand bags");
//		Thread.sleep(2000);
		
		//tag class name ->tag.classname
//		driver.findElement(By.cssSelector("textarea.gLFyf")).sendKeys("samsung");
//		   // OR 
//		driver.findElement(By.cssSelector("textarea.gLFyf")).sendKeys("samsung");
		
		// tag attribute --->   tag[attribute='value']
//		driver.findElement(By.cssSelector("textarea[class=\"gLFyf\"]")).sendKeys("mobiles");
//		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class=\"gLFyf\"]")).sendKeys("mobiles");
		Thread.sleep(2000);
		driver.close();
		// tag class attribute-> tag.classname[attribute="value"] another method
	}

}
