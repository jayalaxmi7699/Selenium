package navigation_WindowHandles;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseParticularWindowAssignment {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.navigate().to("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selinium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();		
		
		List<WebElement> linklist = driver.findElements(By.partialLinkText("Seleni"));
		System.out.println(linklist.size());
//		System.out.println(linklist);
		for (int i = 0; linklist.size() > i; i++) {
			linklist.get(i).click();
//			System.out.println("Text Name: " + linklist.get(i).getText());
		}
		
		Set<String> handle= driver.getWindowHandles();
		
		List<String> windows= new ArrayList<String>(handle);			
		 
		for (String  windowIds : windows) {
			driver.switchTo().window(windowIds);
			System.out.println("Window Title: " + driver.getTitle());			
			
			if(driver.getTitle().equals("Selenium disulfide - Wikipedia")) {
				driver.close();
			}
		}
		// -----window titles--------
//		Window Title: Automation Testing Practice
//		Window Title: Selenium disulfide - Wikipedia
//		Window Title: Selenium (software) - Wikipedia
//		Window Title: Selenium - Wikipedia
//		Window Title: Selenium in biology - Wikipedia
		
		
	
	}
}
