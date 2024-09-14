package conditionalstatements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Method_boolean {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		boolean ele= driver.findElement(By.xpath("//h5[normalize-space()='Login']")).isEnabled();	
//		System.out.println(ele);
//		driver.get("https://demo.nopcommerce.com/");
//		boolean ele= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isEnabled();	
//		System.out.println(ele);
		
		driver.get("https://www.freshworks.com/");
		boolean ele= driver.findElement(By.xpath("//img[@alt='freshworks-logo']")).isDisplayed();
		Thread.sleep(2000);
		System.out.println(ele);
		
		
		driver.close();
	
	
}
}
