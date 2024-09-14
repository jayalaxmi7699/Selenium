package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownAutosuggestion {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");

		List<WebElement> li = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));

		for (int i = 0; li.size() > i; i++) {
			System.out.println(li.get(i).getText());
			if (li.get(i).getText().equals("selenium")) {
				li.get(i).click();
				break;
			}
		}

	}
}
