package selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MutipleDropdowns {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		
WebElement ddown = driver.findElement(By.id("multi-select"));
		
		Select sel = new Select(ddown);
		sel.selectByValue("California");
		Thread.sleep(2000);
		sel.selectByIndex(5);
		Thread.sleep(2000);
		List<WebElement> all = sel.getAllSelectedOptions();
		System.out.println(all.size());
		sel.deselectAll();
		
		Thread.sleep(2000);
		sel.selectByValue("California");
		Thread.sleep(2000);
		sel.selectByIndex(5);
		Thread.sleep(2000);
		
		sel.deselectByIndex(5);
		List<WebElement> allsize = sel.getAllSelectedOptions();
		System.out.println(allsize.size());
		
		
		
		
		System.out.println("successfull");
		driver.quit();
		
		
	}
}
