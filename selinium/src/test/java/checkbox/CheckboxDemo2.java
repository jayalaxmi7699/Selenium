package checkbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxDemo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		List<WebElement> checkpath = driver.findElements(By.xpath("//input[@type='checkbox']//parent::td"));
		System.out.println(checkpath.size());
		
//		for (int i=0; i<checkpath.size(); i++) {
//			checkpath.get(i).click();
//		}

		// Another approach
		for(WebElement checkbox :checkpath ) {
			checkbox.click();
		}
		
		System.out.println("success");
	}

}
