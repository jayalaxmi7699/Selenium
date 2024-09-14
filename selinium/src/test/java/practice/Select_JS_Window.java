package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_JS_Window {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver dri = new ChromeDriver();
		dri.get("https://testautomationpractice.blogspot.com/");
		dri.manage().window().maximize();
		dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		dri.findElement(By.xpath("//input[@id='name']")).sendKeys("Jaya");
		dri.findElement(By.xpath("//input[@id='email']")).sendKeys("Jaya@gmail");
		dri.findElement(By.xpath("//input[@id='phone']")).sendKeys("Jaya");
		dri.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("Delhi");
		dri.findElement(By.xpath("//input[@id='female']")).click();
		dri.findElement(By.xpath("//input[@id='sunday']")).click();
		WebElement dd = dri.findElement(By.xpath("//select[@id='country']"));

		Select s = new Select(dd);
		s.selectByVisibleText("Australia");
		Thread.sleep(2000);
		s.selectByValue("uk");
		s.selectByIndex(4);
		Thread.sleep(2000);
		dri.findElement(By.xpath("//option[@value='green']")).click();

		    // Scroll to the "orange HRM" link
		WebElement w = dri.findElement(By.xpath("//a[normalize-space()='orange HRM']"));
		JavascriptExecutor js = (JavascriptExecutor) dri;
		js.executeScript("arguments[0].scrollIntoView();", w);
		Thread.sleep(2000);
		String parentWindowHandle = dri.getWindowHandle();
		     // Open a new tab and switch to it
		dri.switchTo().newWindow(WindowType.TAB);
		dri.get("https://www.orangehrm.com/");
		
		dri.switchTo().window(parentWindowHandle);
		Thread.sleep(2000);


		dri.quit();
	}
}
