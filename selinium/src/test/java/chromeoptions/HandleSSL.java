package chromeoptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleSSL {
public static void main(String[] args) {
	ChromeOptions opt = new ChromeOptions();
	opt.setAcceptInsecureCerts(true);
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver(opt);
	driver.get("https://expired.badssl.com/"); 
	System.out.println(driver.getTitle());
}
}
