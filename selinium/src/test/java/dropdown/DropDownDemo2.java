package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.navigate().to("https://www.jquery-az.com/boots/demo.php?ex");
		WebElement dd = driver.findElement(By.xpath("//select[@id='country']"));

		//ul[@role='listbox']//li//div[@role='option']
//		
//		for(WebElement el : ele) {
//			System.out.println(el.getText());
//		}

	}
}
