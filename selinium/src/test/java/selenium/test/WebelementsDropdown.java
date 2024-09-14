package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebelementsDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get(
				"https://www.freshworks.com/freshdesk/demo-request/?msclkid=fc2cd616270d154f4482b0b167fb82a3&utm_source=bing&utm_medium=cpc&utm_campaign=FWCSS-Search-CS-India&utm_term=customer%20service%20system&utm_content=Customer%20Service-PM&device=c&matchtype=p&network=o&gclid=&audience=kwd-81020563704673:loc-1660&ad_id=&msclkid=fc2cd616270d154f4482b0b167fb82a3&utm_source=bing&utm_medium=cpc&utm_campaign=FWCSS-Search-CS-India&utm_term=customer%20service%20system&utm_content=Customer%20Service-PM");
		driver.manage().window().maximize();
		WebElement ddown = driver.findElement(By.name("organization-size"));
		
		Select sel = new Select(ddown);
		sel.selectByValue("1-10");
		Thread.sleep(2000);
		
		sel.selectByVisibleText("11-50");
		Thread.sleep(2000);
		
		sel.selectByIndex(6);

		System.out.println("successfull");

	}
}
