package selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverTest {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.getTitle();
		
		if(driver.getTitle().equals("nopCommerce demo store")) 
			System.out.println("Test passed");
		else
			System.out.println("test failed");
		
		driver.quit();;

	}

}
