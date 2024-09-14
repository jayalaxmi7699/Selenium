package practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver dri = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(dri, Duration.ofSeconds(2));
		dri.get("https://testautomationpractice.blogspot.com/");
		dri.manage().window().maximize();
		dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		// Handle Alert box
		dri.findElement(By.xpath("//button[normalize-space()='Alert']")).click();
		Alert al = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(al.getText());
		Thread.sleep(1000);
		al.accept();

		// Handle Confirm box
		dri.findElement(By.xpath("//button[normalize-space()='Confirm Box']")).click();
		Thread.sleep(1000);
		System.out.println(al.getText());
		al.accept();

		// Handle Prompt box
		dri.findElement(By.xpath("//button[normalize-space()='Prompt']")).click();
		Alert at = wait.until(ExpectedConditions.alertIsPresent()); // Use the correct alert object
//		 dri.switchTo().alert();
		at.sendKeys("Hello");
		Thread.sleep(2000);

		at.accept();
		dri.quit();
	}
}
