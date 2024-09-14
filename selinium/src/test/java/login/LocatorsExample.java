package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsExample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://github.com/login");
		driver.findElement(By.id("login_field")).sendKeys("test");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("trfvfj");
		Thread.sleep(2000);
		driver.findElement(By.className("header-logo"));
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgot password?"));
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Create an"));
		Thread.sleep(2000);
//		driver.findElement(By.tagName("Sign in to GitHub")).click();
//		Thread.sleep(2000);
		driver.findElement(By.name("commit")).click();
		driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/label"));
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='commit']"));
		Thread.sleep(2000);

	}

}
