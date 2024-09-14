package navigation_WindowHandles;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesDemo {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

		Set<String> windowID = driver.getWindowHandles();

		List<String> handles = new ArrayList(windowID);
//		String parenID = handles.get(0);
//		String chilID = handles.get(1);
//		
//		driver.switchTo().window(chilID);		
//		System.out.println(driver.getTitle());
//		
//		driver.switchTo().window(parenID);
//		System.out.println(driver.getTitle());
		
		for (String handle : handles) {
			// Switch to the window
			driver.switchTo().window(handle);
			System.out.println("Window Title: " + driver.getTitle());
		}
	}

}
