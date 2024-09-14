package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		WebElement dd = driver.findElement(By.xpath("//select[@id='country']"));

		Select ddoptions = new Select(dd);
//		ddoptions.selectByVisibleText("Japan");
//		ddoptions.selectByValue("canada");
//		ddoptions.selectByIndex(2); //UK
		// Capture options
		List<WebElement> ele = ddoptions.getOptions();
		System.out.println(ele.size());
		
//		for(int i=0; i<ele.size();i++) {
//			System.out.println(ele.get(i).getText());
//		}
		
		for(WebElement el : ele) {
			System.out.println(el.getText());
		}

	}
}
