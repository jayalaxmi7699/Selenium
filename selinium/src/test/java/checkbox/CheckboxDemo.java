package checkbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("hjfjjf");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		List<WebElement> checkpath = driver
				.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

//		for(int i=0; checkpath.size()>i; i++) {			
//			checkpath.get(i).click();
//		}

		// Another approach
//		for(WebElement checkbox :checkpath ) {
//			checkbox.click();
//		}

		// last3 checkboxes
//		for(int i=4; i<checkpath.size(); i++){
//			checkpath.get(i).click();
//		}

		// first 3 checkboxes
		for (int i = 0; i < checkpath.size() - 4; i++) {
			checkpath.get(i).click();

		}
		Thread.sleep(2000);
		for (int i = 0; i < checkpath.size() - 4; i++) {
			if (checkpath.get(i).isSelected()) {
				checkpath.get(i).click();
			}
		}
	}

}
