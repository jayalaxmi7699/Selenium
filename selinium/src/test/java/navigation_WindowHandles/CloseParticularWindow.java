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

public class CloseParticularWindow {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

		Set<String> windowID = driver.getWindowHandles();

		for (String win : windowID) {
			String title = driver.switchTo().window(win).getTitle();
			System.out.println(title);
			
			if (title.equals("OrangeHRM") || title.equals("Human Resources Management Software | OrangeHRM"
					)) {
				driver.close();
			}
		}

	}

}
