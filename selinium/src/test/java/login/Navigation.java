package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.findElement(By.id("firstName")).sendKeys("HYR");
		driver.findElement(By.id("femalerb")).click();
		driver.findElement(By.id("chinesechbx")).click();
		driver.findElement(By.id("englishchbx")).click();
		driver.findElement(By.className("bcButton")).click();
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();		
		
		
		

	}

}
