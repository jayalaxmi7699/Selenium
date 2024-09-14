package slider_keyboardactions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_newWindowOpen {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.salesforce.com/in/?ir=1");
		driver.manage().window().maximize();

		WebElement clLink = driver.findElement(By.xpath("//a[normalize-space()='View all our products']"));

		Actions act = new Actions(driver);
		// cntrl + cl link
		act.keyDown(Keys.CONTROL).click(clLink).keyUp(Keys.CONTROL).perform();
		List<String> ids= new ArrayList( driver.getWindowHandles());
		driver.switchTo().window(ids.get(1));
		driver.findElement(By.xpath("//a[normalize-space()='See all products']")).click();
		
		driver.switchTo().window(ids.get(0));		
		driver.findElement(By.xpath("//a[normalize-space()='Read the report']")).click();
		
	}

}
