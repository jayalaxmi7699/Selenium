package chromeoptions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicControls {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions po = new ChromeOptions();
		
		File f = new File("C:\\Users\\Jayalaxmi\\Selenium Automation Docs\\uBlock-Origin-Lite-Chrome-Web-Store.crx");
		po.addExtensions(f);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(po);
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYR tutorial");
//		Thread.sleep(2000);
//		driver.findElement(By.name("btnK")).submit();
//		Thread.sleep(2000);
//		driver.navigate().to("https://www.facebook.com/login.php/");
//		Thread.sleep(2000);
//		driver.findElement(By.name("email")).sendKeys("jaya");
//		Thread.sleep(2000);
//		driver.navigate().refresh();
		

	}

}
