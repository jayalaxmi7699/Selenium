package navigation_WindowHandles;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popups {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
 //1) first approach    
	/*	driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(2000);		
		driver.switchTo().alert().accept();         // for single alert
		Alert myalert= driver.switchTo().alert();     // for multiple alert
		System.out.println(myalert.getText());          // to print title on alert
		myalert.accept();*/
		
		// 2)second type approach
		/*	driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(2000);
		Alert myalert= driver.switchTo().alert();     // for multiple alert
		myalert.dismiss();*/
		
// #3rd type 
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(2000);
		Alert myalert= driver.switchTo().alert(); // for multiple alert
		myalert.sendKeys("welcome");
		Thread.sleep(2000);
		myalert.accept();
		Thread.sleep(2000);
		driver.close(); 	
	}
}
