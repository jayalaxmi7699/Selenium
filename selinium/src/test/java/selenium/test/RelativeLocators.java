package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
public class RelativeLocators {
	public static void main(String[] args) {

		WebDriver dri = new EdgeDriver();
		dri.get("https://www.saucedemo.com/");
		
		WebElement password = dri.findElement(By.id("password"));
		dri.findElement(RelativeLocator.with(By.tagName("input")).above(By.id("password"))).sendKeys("standard_user");
				




//driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.name("login-button"))).sendKeys("secret_sauce");
//		driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.id("password"))).click();
				
	
		

	}
}
