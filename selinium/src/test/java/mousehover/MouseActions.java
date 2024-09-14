package mousehover;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
//		WebElement frame = driver.findElement(By.xpath("//li[@class='vl-flyout-nav__js-tab']//a[contains(text(),'Electronics')]"));
//		WebElement hover = driver.findElement(By.xpath("//a[normalize-space()='Samsung']"));
		WebElement frame = driver
				.findElement(By.xpath("//a[normalize-space()='Computers']"));
		WebElement hover = driver
				.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		Actions act = new Actions(driver);
		// mouse hover action
		act.moveToElement(frame).moveToElement(hover).click().perform();

	}

}
